package mono.com.google.android.exoplayer.upstream.cache;


public class Cache_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.upstream.cache.Cache.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSpanAdded:(Lcom/google/android/exoplayer/upstream/cache/Cache;Lcom/google/android/exoplayer/upstream/cache/CacheSpan;)V:GetOnSpanAdded_Lcom_google_android_exoplayer_upstream_cache_Cache_Lcom_google_android_exoplayer_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer.Upstream.Cache.ICacheListenerInvoker, ExoPlayer\n" +
			"n_onSpanRemoved:(Lcom/google/android/exoplayer/upstream/cache/Cache;Lcom/google/android/exoplayer/upstream/cache/CacheSpan;)V:GetOnSpanRemoved_Lcom_google_android_exoplayer_upstream_cache_Cache_Lcom_google_android_exoplayer_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer.Upstream.Cache.ICacheListenerInvoker, ExoPlayer\n" +
			"n_onSpanTouched:(Lcom/google/android/exoplayer/upstream/cache/Cache;Lcom/google/android/exoplayer/upstream/cache/CacheSpan;Lcom/google/android/exoplayer/upstream/cache/CacheSpan;)V:GetOnSpanTouched_Lcom_google_android_exoplayer_upstream_cache_Cache_Lcom_google_android_exoplayer_upstream_cache_CacheSpan_Lcom_google_android_exoplayer_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer.Upstream.Cache.ICacheListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Upstream.Cache.ICacheListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Cache_ListenerImplementor.class, __md_methods);
	}


	public Cache_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Cache_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Upstream.Cache.ICacheListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSpanAdded (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1)
	{
		n_onSpanAdded (p0, p1);
	}

	private native void n_onSpanAdded (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1);


	public void onSpanRemoved (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1)
	{
		n_onSpanRemoved (p0, p1);
	}

	private native void n_onSpanRemoved (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1);


	public void onSpanTouched (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1, com.google.android.exoplayer.upstream.cache.CacheSpan p2)
	{
		n_onSpanTouched (p0, p1, p2);
	}

	private native void n_onSpanTouched (com.google.android.exoplayer.upstream.cache.Cache p0, com.google.android.exoplayer.upstream.cache.CacheSpan p1, com.google.android.exoplayer.upstream.cache.CacheSpan p2);

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
