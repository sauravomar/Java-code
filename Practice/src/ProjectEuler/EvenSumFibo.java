//package ProjectEuler;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Set;
//import java.util.TreeSet;
//
///**
// * Created by saurav on 14/7/14.
// */
//public class EvenSumFibo {
//
//    public static Set<Long> fibs = new TreeSet<Long>();
//
//    EvenSumFibo(){
//        fibs.add(0L);
//        fibs.add(1L);
//    }
//
//    public int calulate(int no){
//
//        StringBuffer sb = new StringBuffer();
//
//        for(int T = Integer.parseInt(br.readLine()); T > 0; --T){
//            long N = Long.parseLong(br.readLine());
//            while (curFib < N){
//                long temp = curFib;
//                fibs.add(curFib += prevFib);
//                prevFib = temp;
//            }
//            sb.append(fibs.contains(N) ? "IsFibo\n" : "IsNotFibo\n");
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        StringBuffer sb = new StringBuffer();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for(int T = Integer.parseInt(br.readLine()); T > 0; --T){
//            long N = Long.parseLong(br.readLine());
//            while (curFib < N){
//                long temp = curFib;
//                fibs.add(curFib += prevFib);
//                prevFib = temp;
//            }
//            sb.append(fibs.contains(N) ? "IsFibo\n" : "IsNotFibo\n");
//        }
//        System.out.print(sb);
//    }
//}
