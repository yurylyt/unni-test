package org.unnitest;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Author: Iurii Lytvynenko
 */
public class FestAssertTest {
    @Test
    public void test() throws Exception {
        // Given
        List<String> newEmployees = new LinkedList<String>();
        
        // When
        // Try to remove a nazgul from the list. Try to replace Sam with Gollum
        newEmployees.add("frodo");
        newEmployees.add("sam");
        newEmployees.add("nazgul");
        newEmployees.add("nazgul");
        newEmployees.add("nazgul");
        newEmployees.add("nazgul");
        
        // Then
        assertThat(newEmployees)
            .describedAs("Employees hired today")
            .hasSize(6)
            .contains("frodo", "sam");
    }
}
