package easy;

import easy.array.RemoveDuplicates;
import easy.array.RemoveElement;
import easy.array.TwoSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ogayvoronskiy
 * Created at 11.05.2022
 */
public class ArrayTest {

	private TwoSum twoSum = new TwoSum();
	private RemoveDuplicates removeDuplicates = new RemoveDuplicates();
	private RemoveElement removeElement = new RemoveElement();


	@Test
	@DisplayName("1. Two Sum")
	void twoSumTest() {
		assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{2,7,11,15}, 9));
		assertArrayEquals(new int[]{1,2}, twoSum.twoSum(new int[]{3,2,4}, 6));
		assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{3,3}, 6));
	}

	@Test
	@DisplayName("26. Remove Duplicates from Sorted Array")
	void removeDuplicatesTest() {
		assertEquals(2, removeDuplicates.removeDuplicates(new int[]{1,1,2}));
		assertEquals(5, removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}

	@Test
	@DisplayName("27. Remove Element")
	void removeElementTest() {
		assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));
		assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
	}
}
