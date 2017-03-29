package mono.com.google.android.exoplayer;


public class MediaCodecTrackRenderer_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer.MediaCodecTrackRenderer.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCryptoError:(Landroid/media/MediaCodec$CryptoException;)V:GetOnCryptoError_Landroid_media_MediaCodec_CryptoException_Handler:Com.Google.Android.Exoplayer.MediaCodecTrackRenderer/IEventListenerInvoker, ExoPlayer\n" +
			"n_onDecoderInitializationError:(Lcom/google/android/exoplayer/MediaCodecTrackRenderer$DecoderInitializationException;)V:GetOnDecoderInitializationError_Lcom_google_android_exoplayer_MediaCodecTrackRenderer_DecoderInitializationException_Handler:Com.Google.Android.Exoplayer.MediaCodecTrackRenderer/IEventListenerInvoker, ExoPlayer\n" +
			"n_onDecoderInitialized:(Ljava/lang/String;JJ)V:GetOnDecoderInitialized_Ljava_lang_String_JJHandler:Com.Google.Android.Exoplayer.MediaCodecTrackRenderer/IEventListenerInvoker, ExoPlayer\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer.MediaCodecTrackRenderer+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaCodecTrackRenderer_EventListenerImplementor.class, __md_methods);
	}


	public MediaCodecTrackRenderer_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaCodecTrackRenderer_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer.MediaCodecTrackRenderer+IEventListenerImplementor, ExoPlayer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCryptoError (android.media.MediaCodec.CryptoException p0)
	{
		n_onCryptoError (p0);
	}

	private native void n_onCryptoError (android.media.MediaCodec.CryptoException p0);


	public void onDecoderInitializationError (com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException p0)
	{
		n_onDecoderInitializationError (p0);
	}

	private native void n_onDecoderInitializationError (com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException p0);


	public void onDecoderInitialized (java.lang.String p0, long p1, long p2)
	{
		n_onDecoderInitialized (p0, p1, p2);
	}

	private native void n_onDecoderInitialized (java.lang.String p0, long p1, long p2);

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
