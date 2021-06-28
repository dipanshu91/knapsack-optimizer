package com.maersk.knapsackoptimizerservice.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KnapsackOptimizerUtil {

	public static int[] getSolution(int[] val, int[] weighs, int capacity) {

		int length = val.length;
		if (length <= 0 || capacity <= 0) {
			System.out.println(0);
		}

		int i, j;
		int K[][] = new int[length + 1][capacity + 1];

		for (i = 0; i <= length; i++) {
			for (j = 0; j <= capacity; j++) {
				if (i == 0 || j == 0)
					K[i][j] = 0;
				else if (weighs[i - 1] <= j)
					K[i][j] = Math.max(val[i - 1] + K[i - 1][j - weighs[i - 1]], K[i - 1][j]);
				else
					K[i][j] = K[i - 1][j];
			}
		}

		// stores the result of Knapsack
		int res = K[length][capacity];
		List<Integer> list = new LinkedList<>();
		j = capacity;
		for (i = length; i > 0 && res > 0; i--) {
			if (res == K[i - 1][j])
				continue;
			else {

				// This item is included.
				list.add(i - 1);

				// Since this weight is included its
				// value is deducted
				res = res - val[i - 1];
				j = j - weighs[i - 1];
			}
		}
		Collections.sort(list);
		int[] arr = new int[list.size()];
		for (int l = 0; l < arr.length; l++) {
			arr[l] = list.get(l);
		}
		return arr;
	}

	public static String getAlphaNumericString() {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}
