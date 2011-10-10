package org.eclipse.jetty.nosql.session.xstream;

import org.eclipse.jetty.nosql.session.AbstractFacadeTest;
import org.eclipse.jetty.nosql.session.AbstractSessionFacade;
import org.eclipse.jetty.nosql.session.xstream.XStreamSessionFacade;

public class XStreamFacadeTest extends AbstractFacadeTest {
	@Override
	public AbstractSessionFacade createFacade() {
		return new XStreamSessionFacade();
	}
}
