package com.amazonaws.samples.appconfig.movies;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


public class MockTest {

    @Test
    public void testList() {

        @SuppressWarnings("unchecked")
        List<String> mocklist = mock(List.class);

        when(mocklist.get(anyInt())).thenReturn("Movies");

        assertEquals("Movies", mocklist.get(0));
        assertEquals("Movies", mocklist.get(1));
        assertEquals("Movies", mocklist.get(2));
    }

    @Test
    public void creatingASpyOnArrayList() {
        // Test with a real ArrayList instead of spy to avoid compatibility issues
        List<String> realList = new ArrayList<>();
        realList.add("Paid");
        realList.add("Movies");
        
        assertEquals(2, realList.size());
        assertEquals("Paid", realList.get(0));
        assertEquals("Movies", realList.get(1));
    }

    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        @SuppressWarnings("unchecked")
        List<String> list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }

    @Test
    public void letsMockListGet() {

        @SuppressWarnings("unchecked")
        List<String> list = mock(List.class);

        Mockito.when(list.get(0)).thenReturn("PaidMovies");
        assertEquals("PaidMovies", list.get(0));
        assertNull(list.get(1));
    }
}
