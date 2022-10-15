package lab3;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class ListTests {
    
    @Test 
	public void testFilter() {
    List<String> input1 = new ArrayList<>(Arrays.asList("a", "c", "e"));
    List<String> input2 = new ArrayList<>(Arrays.asList("b", "d", "f"));
    List<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
    assertEquals(expected, ListExamples.merge(input1, input2));
    }
}
