package com.ril.grocery.slotManagement.redis.publisher;

public class BinaryHeap {

	public void heapify(int arr[], int startIndex) {

		int largest = startIndex;

		int leftIndex = 2 * startIndex + 1;
		int rightIndex = 2 * startIndex + 2;

		if (leftIndex < arr.length && getLeftChild(arr, startIndex) > arr[largest])
			largest = leftIndex;

		if (rightIndex < arr.length && getRightChild(arr, startIndex) > arr[largest])
			largest = rightIndex;

		if (startIndex != largest) {
			swap(arr, largest, startIndex);
			heapify(arr, largest);
		}
	}

	public void buildHeap(int arr[]) {

		for (int i = (arr.length / 2 - 1); i >= 0; i--) {
			heapify(arr, i);
		}
	}

	private int getLeftChild(int arr[], int parent) {
		return arr[2 * parent + 1];
	}

	private int getRightChild(int arr[], int parent) {
		return arr[2 * parent + 2];
	}

	private void swap(int arr[], int i, int j) {
		int swap = arr[i];
		arr[i] = arr[j];
		arr[j] = swap;

	}

	public void printHeap(int arr[]) {
		System.out.println("Array representation of Heap is:");

		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };

		BinaryHeap heap = new BinaryHeap();
		heap.buildHeap(arr);
		heap.printHeap(arr);

	}
}
