package org.unnitest;

import javax.inject.Inject;

/**
 * Author: Iurii Lytvynenko
 */
public class Dolor {
    private Lorem lorem;

    @Inject
    public Dolor(Lorem lorem) {
        this.lorem = lorem;
    }
    
    public void sit(Dummy dummy) {
        dummy.setFoo(lorem.ipsum());
    }
}
