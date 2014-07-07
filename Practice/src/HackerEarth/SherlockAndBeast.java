package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by saurav on 28/6/14.
 */
public class SherlockAndBeast {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte[] mults = new byte[]{0, 2, 4, 1, 3, 0, 2, 4, 1, 3};
        for(int T = Integer.parseInt(br.readLine()); T > 0; T--){
            String S = br.readLine();
            int N = Integer.parseInt(S);

            int G = mults[S.charAt(S.length()-1) - 48];
            N -= 3*G;

            if (N < 0){
                sb.append("-1\n");
                continue;
            }

            for(G += 5*(N/15); G > 0; G--){
                sb.append("555");
            }

            for(G = (N%15)/5; G > 0; G--){
                sb.append("33333");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
