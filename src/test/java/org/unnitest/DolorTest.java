package org.unnitest;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Author: Iurii Lytvynenko
 */
@Guice(modules = TestUnniModule.class)
public class DolorTest {
    @Inject
    private Dolor dolor;
    
    @Test
    public void testSit() throws Exception {
        // Given
        Dummy dummy = new Dummy();
        
        // When
        dolor.sit(dummy);
        
        // Then
        assertThat(dummy.getFoo()).isNotNull();
    }
}
