using Android.App;
using Android.Widget;
using Android.OS;
using Android.Content.PM;
using Java.Security;
using System;
using Xamarin.Facebook;
using Xamarin.Facebook.Login.Widget;
using Java.Lang;
using Android.Content;
using Xamarin.Facebook.Login;
using System.Collections.Generic;
using Xamarin.Facebook.Share.Widget;
using Xamarin.Facebook.Share.Model;

namespace FacebookLogin
{
    [Activity(Label = "FacebookLogin", MainLauncher = true, Icon = "@drawable/icon")]

    public class MainActivity : Activity, IFacebookCallback
    {
        private ICallbackManager mCallbackManager;
        private MyProfileTracker mProfileTracker;

        private TextView mTxtFirstName;
        private TextView mTxtLastName;
        private TextView mTxtName;
        private ProfilePictureView mProfilePic;
        private Button mBtnShared;

        public void OnCancel()
        {
            //throw new NotImplementedException();
        }

        public void OnError(FacebookException p0)
        {
            //throw new NotImplementedException();
        }

        public void OnSuccess(Java.Lang.Object result)
        {
            LoginResult loginResult = result as LoginResult;
            //Console.WriteLine(loginResult.AccessToken.UserId);
        }

        protected override void OnActivityResult(int requestCode, Result resultCode, Intent data) {
            base.OnActivityResult(requestCode, resultCode, data);
            mCallbackManager.OnActivityResult(requestCode, (int)resultCode, data);
        }

        protected override void OnDestroy()
        {
            mProfileTracker.StopTracking();
            base.OnDestroy();
        }

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            FacebookSdk.SdkInitialize(this.ApplicationContext);

            mProfileTracker = new MyProfileTracker();
            mProfileTracker.mOnProfileChanged += MProfileTracker_mOnProfileChanged;
            mProfileTracker.StartTracking();

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);
            
            //Button facebookButton = FindViewById<Button>(Resource.Id.button);
            mTxtFirstName = FindViewById<TextView>(Resource.Id.txtFirstName);
            mTxtLastName = FindViewById<TextView>(Resource.Id.txtLastName);
            mTxtName = FindViewById<TextView>(Resource.Id.txtName);
            mProfilePic = FindViewById<ProfilePictureView>(Resource.Id.profilePic);
            mBtnShared = FindViewById<Button>(Resource.Id.btnShare);

            //if (AccessToken.CurrentAccessToken != null) {
            //    //the user is logged through Facebook
            //    facebookButton.Text = "Log Out";
            //}
            
            LoginButton button = FindViewById<LoginButton>(Resource.Id.login_button);
            button.SetReadPermissions("user_friends");
            
            mCallbackManager = CallbackManagerFactory.Create();

            button.RegisterCallback(mCallbackManager, this);

            if (AccessToken.CurrentAccessToken != null)
            {
                try
                {
                    //the user is logged through Facebook
                    mTxtFirstName.Text = Profile.CurrentProfile.FirstName;
                    mTxtLastName.Text = Profile.CurrentProfile.LastName;
                    mTxtName.Text = Profile.CurrentProfile.Name;
                    mProfilePic.ProfileId = Profile.CurrentProfile.Id;
                    mBtnShared.Visibility = Android.Views.ViewStates.Visible;
                }
                catch (System.Exception ex)
                {
                    //Handle error
                    mBtnShared.Visibility = Android.Views.ViewStates.Invisible;
                }
            }
            else {
                mTxtFirstName.Text = "";
                mTxtLastName.Text = "";
                mTxtName.Text = "";
                mBtnShared.Visibility = Android.Views.ViewStates.Invisible;
            }

            //LoginManager.Instance.RegisterCallback(mCallbackManager, this);

            //FindViewById<Button>(Resource.Id.button).Click += (o, e) =>
            //{
            //    if (AccessToken.CurrentAccessToken != null)
            //    {
            //        //the user is logged through Facebook
            //        LoginManager.Instance.LogOut();
            //        facebookButton.Text = "My Facebook Login button";
            //    }
            //    else
            //    {
            //        LoginManager.Instance.LogInWithReadPermissions(this, new List<string> { "public_profile", "user_friends" });
            //        facebookButton.Text = "Log Out";
            //    }
            //};

            ShareLinkContent.Builder shareLinkContentBuilder = new ShareLinkContent.Builder().
                    SetContentDescription("Hello Sharing From facebook").
                    SetContentTitle("Business App");
            shareLinkContentBuilder.SetContentUrl(Android.Net.Uri.Parse("https://developer.xamarin.com/api/"));
            shareLinkContentBuilder.SetImageUrl(Android.Net.Uri.Parse("http://www.modusoftware.com/images/xamarin.png"));
            ShareLinkContent content = shareLinkContentBuilder.Build();
            
            //mBtnShared.ShareContent = content;
            mBtnShared.Click += (o, e) => 
            {
                ShareDialog shareDialog = new ShareDialog(this);
                shareDialog.Show(content, ShareDialog.Mode.Automatic);
            };

            LikeView likeView = (LikeView)FindViewById(Resource.Id.likeView);
            likeView.SetObjectIdAndType(
                "https://www.facebook.com/FacebookDevelopers",
                LikeView.ObjectType.Page);

        }

        private void MProfileTracker_mOnProfileChanged(object sender, OnProfileChangedEventArgs e)
        {
            if (e.mProfile != null)
            {
                try
                {
                    mTxtFirstName.Text = e.mProfile.FirstName;
                    mTxtLastName.Text = e.mProfile.LastName;
                    mTxtName.Text = e.mProfile.Name;
                    mProfilePic.ProfileId = e.mProfile.Id;

                    mBtnShared.Visibility = Android.Views.ViewStates.Visible;
                }
                catch (System.Exception ex) { }
            }
            else {
                //the user must have logged out
                mTxtFirstName.Text = "";
                mTxtLastName.Text = "";
                mTxtName.Text = "";
                mProfilePic.ProfileId = null;

                mBtnShared.Visibility = Android.Views.ViewStates.Invisible;
            }
        }
    }

    public class MyProfileTracker : ProfileTracker
    {
        public event EventHandler<OnProfileChangedEventArgs> mOnProfileChanged;
        protected override void OnCurrentProfileChanged(Profile oldProfile, Profile newProfile)
        {
            if (mOnProfileChanged != null) {
                mOnProfileChanged.Invoke(this, new OnProfileChangedEventArgs(newProfile));
            }
        }
    }

    public class OnProfileChangedEventArgs : EventArgs {
        public Profile mProfile;
        public OnProfileChangedEventArgs(Profile profile) {
            mProfile = profile;
        }
    }

}

