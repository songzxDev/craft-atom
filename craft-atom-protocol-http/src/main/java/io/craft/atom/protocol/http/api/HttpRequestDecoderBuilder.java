package io.craft.atom.protocol.http.api;

import io.craft.atom.protocol.ProtocolDecoder;
import io.craft.atom.protocol.http.HttpRequestDecoder;
import io.craft.atom.protocol.http.model.HttpRequest;

import java.nio.charset.Charset;


/**
 * Builder for {@link HttpRequestDecoder}
 * 
 * @author mindwind
 * @version 1.0, Aug 5, 2014
 */
public class HttpRequestDecoderBuilder {

	
	private Charset charset           = Charset.forName("utf-8");
	private int     defaultBufferSize = 2048                    ;
	private int     maxLineLength     = defaultBufferSize       ;
	private int     maxRequestSize    = defaultBufferSize * 1024;
	
	
	public HttpRequestDecoderBuilder charset          (Charset charset)       { this.charset           = charset          ; return this; }
	public HttpRequestDecoderBuilder defaultBufferSize(int defaultBufferSize) { this.defaultBufferSize = defaultBufferSize; return this; }
	public HttpRequestDecoderBuilder maxLineLength    (int maxLineLength)     { this.maxLineLength     = maxLineLength    ; return this; }
	public HttpRequestDecoderBuilder maxRequestSize   (int maxRequestSize)    { this.maxRequestSize    = maxRequestSize   ; return this; }
	
	
	public ProtocolDecoder<HttpRequest> build() {
		return new HttpRequestDecoder(charset, defaultBufferSize, maxLineLength, maxRequestSize);
	}
	
}
