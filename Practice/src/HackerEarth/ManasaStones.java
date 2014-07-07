package HackerEarth;
import java.io.*;


public class ManasaStones{
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(byte T = Byte.parseByte(br.readLine().trim()); T > 0; --T){
            short N = Short.parseShort(br.readLine().trim());
            short A = Short.parseShort(br.readLine().trim());
            short B = Short.parseShort(br.readLine().trim());

            if (A > B){
                short temp = A;
                A = B;
                B = temp;
            }

            int val = ((int)--N)*A;
            short dval = (short)(B - A);

            sb.append(val);
            if (dval > 0){
                while(N-- > 0){
                    sb.append(" " + (val += dval));
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}