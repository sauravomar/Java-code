package com.ril.grocery.slotManagement.redis.publisher;

public class MaximumSumTwoLinkedList {

	Node head; 
	
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a node at start of linked list */
	void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public void findSum(Node root1, Node root2) {

		Node curr1 = root1;
		Node curr2 = root2;
		Node pre1 = root1;
		Node pre2 = root2;

		int sum1 = 0;
		int sum2 = 0;

		Node result = null;

		while (curr1 != null && curr2 != null) {

			while (curr1 != null && curr2 != null && curr1.data != curr2.data) {

				if (curr1.data < curr2.data) {
					sum1 = sum1 + curr1.data;
					curr1 = curr1.next;
				} else {
					sum2 = sum2 + curr2.data;
					curr2 = curr2.next;
				}
			}

			if (curr1 == null) {
				while (curr1 != null) {
					sum1 = sum1 + curr1.data;
					curr1 = curr1.next;
				}
			}

			if (curr2 == null) {
				while (curr2 != null) {
					sum2 = sum2 + curr2.data;
					curr2 = curr2.next;
				}
			}

			if (pre1 == root1 && pre2 == root2) {
				result = sum1 > sum2 ? pre1 : pre2;
			}

			else {
				if (sum1 > sum2)
					pre2.next = pre1.next;
				else
					pre1.next = pre2.next;
			}

			if (curr1 != null)
				curr1 = curr1.next;

			if (curr2 != null)
				curr2 = curr2.next;

		}

		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
	}
	
	/* Drier program to test above functions */
    public static void main(String args[]) 
    { 
    	MaximumSumTwoLinkedList llist1 = new MaximumSumTwoLinkedList(); 
    	MaximumSumTwoLinkedList llist2 = new MaximumSumTwoLinkedList(); 
  
        //Linked List 1 : 1->3->30->90->110->120->NULL 
        //Linked List 2 : 0->3->12->32->90->100->120->130->NULL 
  
        llist1.push(120); 
        llist1.push(110); 
        llist1.push(90); 
        llist1.push(30); 
        llist1.push(3); 
        llist1.push(1); 
  
        llist2.push(130); 
        llist2.push(120); 
        llist2.push(100); 
        llist2.push(90); 
        llist2.push(32); 
        llist2.push(12); 
        llist2.push(3); 
        llist2.push(0); 
  
        llist1.findSum(llist1.head, llist2.head); 
    } 
} 
	