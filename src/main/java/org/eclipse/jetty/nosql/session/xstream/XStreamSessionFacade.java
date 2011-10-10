package org.eclipse.jetty.nosql.session.xstream;

import org.eclipse.jetty.nosql.session.*;

public class XStreamSessionFacade extends AbstractSessionFacade {
	public XStreamSessionFacade() {
		sessionFactory = new XStreamSessionFactory();
		transcoder = new XStreamTranscoder();
	}

	@Override
	public byte[] pack(ISerializableSession session, ISerializationTranscoder tc) throws TranscoderException {
		byte[] raw = null;
		try {
			raw = tc.encode(session);
		} catch (Exception error) {
			throw(new TranscoderException(error));
		}
		return raw;
	}

	@Override
	public ISerializableSession unpack(byte[] raw, ISerializationTranscoder tc) throws TranscoderException {
		ISerializableSession session = null;
		try {
			session = tc.decode(raw, XStreamSession.class);
		} catch (Exception error) {
			throw(new TranscoderException(error));
		}
		return session;
	}
}
