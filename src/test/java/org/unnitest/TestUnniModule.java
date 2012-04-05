package org.unnitest;

import com.google.inject.AbstractModule;

import static org.mockito.Mockito.mock;

/**
 * Different modules can be used to create specific bindings. 
 * Author: Iurii Lytvynenko
 */
public class TestUnniModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Lorem.class).toInstance(mock(Lorem.class));

    }
}
