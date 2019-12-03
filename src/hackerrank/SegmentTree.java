package com.ril.slot;

public class SegmentTree {

	int tree[];

	public int build(int arr[], int node, int start, int end) {

		if (start == end) {
			tree[node] = arr[start];
		} else {
			int mid = start + getMid(start, end);
			int left = build(arr, (2 * node) + 1, start, mid);
			int right = build(arr, (2 * node) + 2, mid + 1, end);
			tree[node] = left + right;
		}
		return tree[node];
	}

	public int getMid(int s, int e) {
		return (e - s) / 2;
	}

	public int getSum(int start, int end, int queryIndexStart, int queryIndexEnd, int node) {

		if (queryIndexStart <= start && queryIndexEnd >= end)
			return tree[node];

		if (end < queryIndexStart || start > queryIndexEnd)
			return 0;

		int mid = start + getMid(start, end);
		return getSum(start, mid, queryIndexStart, queryIndexEnd, (2 * node) + 1)
				+ getSum(mid + 1, end, queryIndexStart, queryIndexEnd, (2 * node) + 2);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 9, 7, 11 };
		SegmentTree obj = new SegmentTree();
		obj.tree = new int[(2 * arr.length + 1)];
		obj.build(arr, 0, 0, arr.length - 1);
		System.out.println(obj.getSum(0, arr.length - 1, 1, 3, 0));
		System.out.println(obj.tree);
	}
}
