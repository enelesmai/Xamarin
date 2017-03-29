package mono.com.google.android.exoplayer.upstream.cache;


public class CacheDataSource_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.upstream.cache.CacheDataSource.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCachedBytesRead:(JJ)V:GetOnCachedBytesRead_JJHandler:Com.Google.Android.Exoplayer.Upstream.Cache.CacheDataSource/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Upstream.Cache.CacheDataSource+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CacheDataSource_EventListenerImplementor.class, __md_methods);
	}


	public CacheDataSource_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CacheDataSource_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Upstream.Cache.CacheDataSource+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCachedBytesRead (long p0, long p1)
	{
		n_onCachedBytesRead (p0, p1);
	}

	private native void n_onCachedBytesRead (long p0, long p1);

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
