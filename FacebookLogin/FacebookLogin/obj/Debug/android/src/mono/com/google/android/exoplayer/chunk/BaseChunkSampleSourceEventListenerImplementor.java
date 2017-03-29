package mono.com.google.android.exoplayer.chunk;


public class BaseChunkSampleSourceEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.chunk.BaseChunkSampleSourceEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDownstreamFormatChanged:(ILcom/google/android/exoplayer/chunk/Format;IJ)V:GetOnDownstreamFormatChanged_ILcom_google_android_exoplayer_chunk_Format_IJHandler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"n_onLoadCanceled:(IJ)V:GetOnLoadCanceled_IJHandler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"n_onLoadCompleted:(IJIILcom/google/android/exoplayer/chunk/Format;JJJJ)V:GetOnLoadCompleted_IJIILcom_google_android_exoplayer_chunk_Format_JJJJHandler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"n_onLoadError:(ILjava/io/IOException;)V:GetOnLoadError_ILjava_io_IOException_Handler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"n_onLoadStarted:(IJIILcom/google/android/exoplayer/chunk/Format;JJ)V:GetOnLoadStarted_IJIILcom_google_android_exoplayer_chunk_Format_JJHandler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"n_onUpstreamDiscarded:(IJJ)V:GetOnUpstreamDiscarded_IJJHandler:Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseChunkSampleSourceEventListenerImplementor.class, __md_methods);
	}


	public BaseChunkSampleSourceEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BaseChunkSampleSourceEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Chunk.IBaseChunkSampleSourceEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDownstreamFormatChanged (int p0, com.google.android.exoplayer.chunk.Format p1, int p2, long p3)
	{
		n_onDownstreamFormatChanged (p0, p1, p2, p3);
	}

	private native void n_onDownstreamFormatChanged (int p0, com.google.android.exoplayer.chunk.Format p1, int p2, long p3);


	public void onLoadCanceled (int p0, long p1)
	{
		n_onLoadCanceled (p0, p1);
	}

	private native void n_onLoadCanceled (int p0, long p1);


	public void onLoadCompleted (int p0, long p1, int p2, int p3, com.google.android.exoplayer.chunk.Format p4, long p5, long p6, long p7, long p8)
	{
		n_onLoadCompleted (p0, p1, p2, p3, p4, p5, p6, p7, p8);
	}

	private native void n_onLoadCompleted (int p0, long p1, int p2, int p3, com.google.android.exoplayer.chunk.Format p4, long p5, long p6, long p7, long p8);


	public void onLoadError (int p0, java.io.IOException p1)
	{
		n_onLoadError (p0, p1);
	}

	private native void n_onLoadError (int p0, java.io.IOException p1);


	public void onLoadStarted (int p0, long p1, int p2, int p3, com.google.android.exoplayer.chunk.Format p4, long p5, long p6)
	{
		n_onLoadStarted (p0, p1, p2, p3, p4, p5, p6);
	}

	private native void n_onLoadStarted (int p0, long p1, int p2, int p3, com.google.android.exoplayer.chunk.Format p4, long p5, long p6);


	public void onUpstreamDiscarded (int p0, long p1, long p2)
	{
		n_onUpstreamDiscarded (p0, p1, p2);
	}

	private native void n_onUpstreamDiscarded (int p0, long p1, long p2);

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
