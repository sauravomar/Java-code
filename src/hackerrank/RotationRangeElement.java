package com.ril.grocery.slotManagement.redis.publisher;

public class RotationRangeElement {

	public boolean isLeftRotation(int start, int end) {
		return end > start;
	}

	public int findElement(int arr[], int rotation[][], int index) {

		int updatedIndex = index;

		for (int i = 0; i < rotation.length; i++) {

			int start = rotation[i][0];
			int end = rotation[i][1];

			if (updatedIndex >= start && updatedIndex <= end) {

				if (isLeftRotation(start, end)) {

					if (updatedIndex == end) {
						updatedIndex = updatedIndex + 1;
					} else {
						updatedIndex = updatedIndex - 1;
					}
				} else {
					if (updatedIndex == 0) {
						updatedIndex = end;
					} else {
						updatedIndex = updatedIndex +1;
					}
				}
				
				if (updatedIndex < 0)
					updatedIndex = updatedIndex + end;
				if (updatedIndex > end)
					updatedIndex = end - updatedIndex;

			}

		}

	

		return arr[updatedIndex];

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int rotation[][] = { { 0, 2 }, { 0, 3 } };
		System.out.println(new RotationRangeElement().findElement(arr, rotation, 1));
	}

}
