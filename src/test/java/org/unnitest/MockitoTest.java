package org.unnitest;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Author: Iurii Lytvynenko
 */
public class MockitoTest {
    @Test
    public void testMockito() throws Exception {
        // Given
        List mocked = mock(List.class);
        
        when(mocked.get(0)).thenReturn("first");
        
        // When
        // Comment the line below to see what happens
        mocked.get(0);
        // Try to duplicate the line to call get(0) twice

        // Note that calling get method with other parameter doe not make test to pass
        // Uncomment to the line below to see the result
//        mocked.get(1);
        // Then
        verify(mocked).get(0);
    }
    
    @Test
    public void testMockingMistake() throws Exception {
        Map mockedMap = mock(Map.class);
        
        Object someObj = new Object();
        
        // Uncomment the line below to reproduce Mockito configuration mistake 
//        when(mockedMap.put(any(),someObj)).thenReturn(false);
    }
}
