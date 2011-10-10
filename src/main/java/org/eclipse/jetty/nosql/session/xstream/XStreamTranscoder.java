package org.eclipse.jetty.nosql.session.xstream;

import org.eclipse.jetty.nosql.session.ISerializationTranscoder;
import org.eclipse.jetty.nosql.session.TranscoderException;

import com.thoughtworks.xstream.XStream;

public class XStreamTranscoder implements ISerializationTranscoder {
	private XStream xstream = null;
	public XStreamTranscoder() {
		xstream = new XStream();
	}

	public byte[] encode(Object obj) throws TranscoderException {
		byte[] raw = null;
		try {
			raw = xstream.toXML(obj).getBytes("UTF-8");
		} catch (Exception error) {
			throw(new TranscoderException(error));
		}
		return raw;
	}

	public <T> T decode(byte[] raw, Class<T> klass) throws TranscoderException {
		T obj = null;
		try {
			obj = (T) xstream.fromXML(new String(raw, "UTF-8"));
		} catch (Exception error) {
			throw(new TranscoderException(error));
		}
		return obj;
	}
}
