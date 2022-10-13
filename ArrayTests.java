package lab3;

import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] test = {1, 2, 3};
    ArrayExamples.reverseInPlace(test);
    System.out.println("ReverseInPlace2: " + test[0] + " " + test[1] + " " + test[2]);
    assertArrayEquals(new int[]{3, 2, 1}, test);
  }

  @Test
  public void testReversed2() {
    int[] test = {1, 2, 3};
    int[] reversed = ArrayExamples.reversed(test);
    System.out.println("Reversed: " + reversed[0] + " " + reversed[1] + " " + reversed[2]);
    assertArrayEquals(new int[]{3, 2, 1}, reversed);
  }
}
