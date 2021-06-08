package com.kchandrakant.learning.stream.impl;

import com.google.inject.AbstractModule;
import com.kchandrakant.learning.hello.api.HelloService;
import com.kchandrakant.learning.stream.api.StreamService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * The module that binds the StreamService so that it can be served.
 */
public class StreamModule extends AbstractModule implements ServiceGuiceSupport {
	@Override
	protected void configure() {
		// Bind the StreamService service
		bindService(StreamService.class, StreamServiceImpl.class);
		// Bind the HelloService client
		bindClient(HelloService.class);
		// Bind the subscriber eagerly to ensure it starts up
		bind(StreamSubscriber.class).asEagerSingleton();
	}
}
