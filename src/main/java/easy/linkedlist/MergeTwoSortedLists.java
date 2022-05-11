package easy.linkedlist;

import main.ListNode;

import java.util.List;

/**
 * @author ogayvoronskiy
 * Created at 08.04.2022
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		return merge(list1, list2);
	}
	private ListNode merge(ListNode list1, ListNode list2) {
		ListNode result = list1.val < list2.val ? list1 : list2;
		if (list1.next != null) {
			merge(list1.next, list2);
		} else {
			list1.next = list2;
		}
		return result;
	}
//	private void merge(ListNode list1, ListNode list2) {
//		if (list1.next != null) {
//			merge(list1.next, list2);
//		} else {
//			list1.next = list2;
//		}
//	}
//
//	private void sort(ListNode list) {
//		ListNode result = list;
//		while (list.next != null) {
//			if (list.val > list.next.val) {
//				int next = list.next.val;
//				list.next.val = list.val;
//				list.val = next;
//				sort(list);
//			}
//			list = list.next;
//		}
//	}
}
