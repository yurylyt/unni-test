package org.unnitest;

import com.google.inject.AbstractModule;

/**
 * Author: Iurii Lytvynenko
 */
public class UnniModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Lorem.class).to(LoremImpl.class);
    }
}
