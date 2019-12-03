package com.ril.slot;

public class HackerRankLCS {

	static int tutzkiAndLcs(String a, String b) {

		int N = a.length(), M = b.length();

		int dpl[][] = new int[b.length() + 1][a.length() + 1];
		int dpr[][] = new int[b.length() + 1][a.length() + 1];

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (a.charAt(j - 1) == b.charAt(i - 1))
					dpl[i][j] = dpl[i - 1][j - 1] + 1;
				else
					dpl[i][j] = Math.max(dpl[i - 1][j], dpl[i][j - 1]);
			}
		}
		int LCS = dpl[M][N];
		for (int i = M - 1; i >= 0; i--) {
			for (int j = N - 1; j >= 0; j--) {
				if (a.charAt(j) == b.charAt(i)) {
					dpr[i][j] = dpr[i + 1][j + 1] + 1;
				} else {
					dpr[i][j] = Math.max(dpr[i + 1][j], dpr[i][j + 1]);
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= M; i++) {
			for (int j = 0; j <= N; j++) {
				if (dpl[i - 1][j] + dpr[i][j] == LCS)
					ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(HackerRankLCS.tutzkiAndLcs("zswcgnrhjroxzlsbkufcnarsyyntvlmefsvbmvoxahqkeasofnqsrmywytzjjamaipisgfgccelgdzbznaynnrrcmrpdwprstwtc", "uxtmfimpzvhmarltpkzcjtdituvmtbpypwsjyqzkhiqsxetpdgwuobvijndfntzarrrrrtrtinhlqqknehbiakjnglfiudgokzymevjkttpvocifknkddffddvexvvtydazqehjqpswbpzryxthgwyjjaiigvkogjuirghctzmrhurpsfyxrlcfavesxelorgqcoqqee"));
	}

}
