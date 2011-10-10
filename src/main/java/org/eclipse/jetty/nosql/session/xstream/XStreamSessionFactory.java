package org.eclipse.jetty.nosql.session.xstream;

import org.eclipse.jetty.nosql.session.ISerializableSession;
import org.eclipse.jetty.nosql.session.AbstractSessionFactory;

public class XStreamSessionFactory extends AbstractSessionFactory {
	public ISerializableSession create() {
		return new XStreamSession();
	}
}
