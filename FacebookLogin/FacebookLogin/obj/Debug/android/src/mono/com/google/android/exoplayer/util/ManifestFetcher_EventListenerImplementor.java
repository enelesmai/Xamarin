package mono.com.google.android.exoplayer.util;


public class ManifestFetcher_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.util.ManifestFetcher.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onManifestError:(Ljava/io/IOException;)V:GetOnManifestError_Ljava_io_IOException_Handler:Com.Google.Android.Exoplayer.Util.ManifestFetcher/IEventListenerInvoker, ExoPlayer\n" +
			"n_onManifestRefreshStarted:()V:GetOnManifestRefreshStartedHandler:Com.Google.Android.Exoplayer.Util.ManifestFetcher/IEventListenerInvoker, ExoPlayer\n" +
			"n_onManifestRefreshed:()V:GetOnManifestRefreshedHandler:Com.Google.Android.Exoplayer.Util.ManifestFetcher/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Util.ManifestFetcher+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ManifestFetcher_EventListenerImplementor.class, __md_methods);
	}


	public ManifestFetcher_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ManifestFetcher_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Util.ManifestFetcher+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onManifestError (java.io.IOException p0)
	{
		n_onManifestError (p0);
	}

	private native void n_onManifestError (java.io.IOException p0);


	public void onManifestRefreshStarted ()
	{
		n_onManifestRefreshStarted ();
	}

	private native void n_onManifestRefreshStarted ();


	public void onManifestRefreshed ()
	{
		n_onManifestRefreshed ();
	}

	private native void n_onManifestRefreshed ();

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
