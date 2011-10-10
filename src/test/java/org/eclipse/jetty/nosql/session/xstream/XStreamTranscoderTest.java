package org.eclipse.jetty.nosql.session.xstream;

import org.eclipse.jetty.nosql.session.AbstractTranscoderTest;
import org.eclipse.jetty.nosql.session.ISerializationTranscoder;
import org.eclipse.jetty.nosql.session.xstream.XStreamTranscoder;

public class XStreamTranscoderTest extends AbstractTranscoderTest {
	@Override
	public ISerializationTranscoder createTranscoder() {
		return new XStreamTranscoder();
	}
}
