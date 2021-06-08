package com.kchandrakant.learning.hello.impl;

import com.google.inject.AbstractModule;
import com.kchandrakant.learning.hello.api.HelloService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * The module that binds the HelloService so that it can be served.
 */
public class HelloModule extends AbstractModule implements ServiceGuiceSupport {
  @Override
  protected void configure() {
    bindService(HelloService.class, HelloServiceImpl.class);
  }
}
