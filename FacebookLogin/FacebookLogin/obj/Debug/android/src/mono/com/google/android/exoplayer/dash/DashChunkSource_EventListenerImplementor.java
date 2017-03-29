package mono.com.google.android.exoplayer.dash;


public class DashChunkSource_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.dash.DashChunkSource.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAvailableRangeChanged:(ILcom/google/android/exoplayer/TimeRange;)V:GetOnAvailableRangeChanged_ILcom_google_android_exoplayer_TimeRange_Handler:Com.Google.Android.Exoplayer.Dash.DashChunkSource/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Dash.DashChunkSource+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DashChunkSource_EventListenerImplementor.class, __md_methods);
	}


	public DashChunkSource_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DashChunkSource_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Dash.DashChunkSource+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAvailableRangeChanged (int p0, com.google.android.exoplayer.TimeRange p1)
	{
		n_onAvailableRangeChanged (p0, p1);
	}

	private native void n_onAvailableRangeChanged (int p0, com.google.android.exoplayer.TimeRange p1);

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
