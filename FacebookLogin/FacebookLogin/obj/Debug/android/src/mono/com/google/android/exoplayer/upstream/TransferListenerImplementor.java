package mono.com.google.android.exoplayer.upstream;


public class TransferListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.upstream.TransferListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBytesTransferred:(I)V:GetOnBytesTransferred_IHandler:Com.Google.Android.Exoplayer.Upstream.ITransferListenerInvoker, ExoPlayer\n" +
			"n_onTransferEnd:()V:GetOnTransferEndHandler:Com.Google.Android.Exoplayer.Upstream.ITransferListenerInvoker, ExoPlayer\n" +
			"n_onTransferStart:()V:GetOnTransferStartHandler:Com.Google.Android.Exoplayer.Upstream.ITransferListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.Upstream.ITransferListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TransferListenerImplementor.class, __md_methods);
	}


	public TransferListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TransferListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.Upstream.ITransferListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onBytesTransferred (int p0)
	{
		n_onBytesTransferred (p0);
	}

	private native void n_onBytesTransferred (int p0);


	public void onTransferEnd ()
	{
		n_onTransferEnd ();
	}

	private native void n_onTransferEnd ();


	public void onTransferStart ()
	{
		n_onTransferStart ();
	}

	private native void n_onTransferStart ();

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
