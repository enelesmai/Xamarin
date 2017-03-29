package mono.com.google.android.exoplayer;


public class DefaultLoadControl_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.DefaultLoadControl.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadingChanged:(Z)V:GetOnLoadingChanged_ZHandler:Com.Google.Android.Exoplayer.DefaultLoadControl/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.DefaultLoadControl+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DefaultLoadControl_EventListenerImplementor.class, __md_methods);
	}


	public DefaultLoadControl_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DefaultLoadControl_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.DefaultLoadControl+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLoadingChanged (boolean p0)
	{
		n_onLoadingChanged (p0);
	}

	private native void n_onLoadingChanged (boolean p0);

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
