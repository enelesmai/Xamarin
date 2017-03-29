package mono.com.google.android.exoplayer;


public class ExoPlayer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.ExoPlayer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPlayWhenReadyCommitted:()V:GetOnPlayWhenReadyCommittedHandler:Com.Google.Android.Exoplayer.IExoPlayerListenerInvoker, ExoPlayer\n" +
			"n_onPlayerError:(Lcom/google/android/exoplayer/ExoPlaybackException;)V:GetOnPlayerError_Lcom_google_android_exoplayer_ExoPlaybackException_Handler:Com.Google.Android.Exoplayer.IExoPlayerListenerInvoker, ExoPlayer\n" +
			"n_onPlayerStateChanged:(ZI)V:GetOnPlayerStateChanged_ZIHandler:Com.Google.Android.Exoplayer.IExoPlayerListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.IExoPlayerListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ExoPlayer_ListenerImplementor.class, __md_methods);
	}


	public ExoPlayer_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ExoPlayer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.IExoPlayerListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPlayWhenReadyCommitted ()
	{
		n_onPlayWhenReadyCommitted ();
	}

	private native void n_onPlayWhenReadyCommitted ();


	public void onPlayerError (com.google.android.exoplayer.ExoPlaybackException p0)
	{
		n_onPlayerError (p0);
	}

	private native void n_onPlayerError (com.google.android.exoplayer.ExoPlaybackException p0);


	public void onPlayerStateChanged (boolean p0, int p1)
	{
		n_onPlayerStateChanged (p0, p1);
	}

	private native void n_onPlayerStateChanged (boolean p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
