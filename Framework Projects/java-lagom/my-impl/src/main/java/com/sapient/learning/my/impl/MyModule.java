package com.sapient.learning.my.impl;

import com.google.inject.AbstractModule;
import com.kchandrakant.learning.custom.api.CustomService;
import com.kchandrakant.learning.my.api.MyService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class MyModule extends AbstractModule implements ServiceGuiceSupport {
	@Override
	protected void configure() {
		bindService(MyService.class, MyServiceImpl.class);
		bindClient(CustomService.class);
	}
}
