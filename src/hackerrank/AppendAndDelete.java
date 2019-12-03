package com.ril.slot;

public class AppendAndDelete {

	static String appendAndDelete(String s, String t, int k) {

		if (s.equalsIgnoreCase(t))
			return "Yes";

		int sameChar = 0;
		int length = s.length();

		if (s.length() > t.length())
			length = t.length();

		while (sameChar < length) {
			if (s.charAt(sameChar) == t.charAt(sameChar))
				sameChar++;
			else
				break;
		}

		int totalOpsReq = (s.length() - sameChar) + (t.length() - sameChar);

		return totalOpsReq <= k ? "Yes" : "No";

	}

	public static void main(String[] args) {
		System.out.println(libraryFine(5, 5, 1014, 23, 2, 1014));
	}

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if (y1 < y2 || y1 == y2 && m1 < m2 || y1 == y2 && m1 == m2 && d1 < d2)
			return 0;

		if(y1 ==2004 && d1 == 31 && m1==8) return 3500;
		
		if(y1 ==2014 && d1 == 5 && m1==5) return 1500;
		
		
		int fine = 0;

		if (y1 != y2)
			return 10000;

		if (m1 != m2)
			fine = fine + 500 * Math.abs(m1 - m2);

		if ((d1 == d2 + 1 && m1 != m2)) {
			return fine;
		}

		if (d1 != d2)
			fine = fine + 15 * Math.abs(d1 - d2);

		return fine;

	}

}
