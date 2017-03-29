package mono.com.google.android.exoplayer.drm;


public class StreamingDrmSessionManager_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.drm.StreamingDrmSessionManager.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDrmKeysLoaded:()V:GetOnDrmKeysLoadedHandler:Com.Google.Android.Exoplayer.Drm.StreamingDrmSessionManager/IEventListenerInvoker, ExoPlayer\n" +
			"n_onDrmSessionManagerError:(Ljava/lang/Exception;)V:GetOnDrmSessionManagerError_Ljava_lang_Exception_Handler:Com.Google.Android.Exoplayer.Drm.StreamingDrmSessionManager/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Drm.StreamingDrmSessionManager+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StreamingDrmSessionManager_EventListenerImplementor.class, __md_methods);
	}


	public StreamingDrmSessionManager_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == StreamingDrmSessionManager_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Drm.StreamingDrmSessionManager+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDrmKeysLoaded ()
	{
		n_onDrmKeysLoaded ();
	}

	private native void n_onDrmKeysLoaded ();


	public void onDrmSessionManagerError (java.lang.Exception p0)
	{
		n_onDrmSessionManagerError (p0);
	}

	private native void n_onDrmSessionManagerError (java.lang.Exception p0);

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
