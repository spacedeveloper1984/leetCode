package easy;

import easy.linkedlist.MergeTwoSortedLists;
import main.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ogayvoronskiy
 * Created at 08.04.2022
 */
class LinkedListTest {

	MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

	@Test
	@DisplayName("21. Merge Two Sorted Lists")
	void mergeTwoLists() {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode listExpected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
		assertEquals(listExpected, mergeTwoSortedLists.mergeTwoLists(list1, list2));
	}
}