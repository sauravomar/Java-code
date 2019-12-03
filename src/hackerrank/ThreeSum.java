package com.ril.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];

				if (sum == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[start]);
					list.add(nums[end]);

					Collections.sort(list);
					result.add(list);
					end--;
					start++;
				} else if (sum > 0) {
					end--;
				} else if (sum < 0) {
					start++;
				} else {
					end--;
					start++;
				}
			}
		}

		return result.stream().distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		int[] nums = new int[] { -4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6 };
		List<List<Integer>> result = new ThreeSum().threeSum(nums);
		System.out.println(result);
	}
}
