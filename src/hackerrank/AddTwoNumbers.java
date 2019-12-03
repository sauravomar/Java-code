package com.ril.slot;

public class AddTwoNumbers {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode result = null;
		ListNode start = null;

		int val = 0;
		int carry = 0;

		while (l1 != null && l2 != null) {
			val = l1.val + l2.val + carry;

			if (val >= 10) {
				carry = val / 10;
				val = val % 10;

			} else {
				carry = 0;
			}

			if (result == null) {
				result = new ListNode(val);
				start = result;
			} else {
				result.next = new ListNode(val);
				result = result.next;

			}
			l1 = l1.next;
			l2 = l2.next;

		}

		while (l1 != null) {

			val = carry + l1.val;

			if (val >= 10) {
				carry = val / 10;
				val = val % 10;
			} else {
				carry = 0;
			}
			result.next = new ListNode(val);
			result = result.next;
			l1 = l1.next;
		}

		while (l2 != null) {
			val = carry + l2.val;

			if (val >= 10) {
				carry = val / 10;
				val = val % 10;
			} else {
				carry = 0;
			}

			result.next = new ListNode(val);
			result = result.next;
			l2 = l2.next;
		}

		if (carry != 0)
			result.next = new ListNode(carry);
		
		return start;
	}

	public static void main(String[] args) {

		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode l1 = obj.new ListNode(1);
//		l1.next = obj.new ListNode(4);
//		l1.next.next = obj.new ListNode(3);

		ListNode l2 = obj.new ListNode(9);
		l2.next = obj.new ListNode(9);
//		l2.next.next = obj.new ListNode(4);

		ListNode result = obj.addTwoNumbers(l1, l2);
		System.out.println(result);
	}
}
