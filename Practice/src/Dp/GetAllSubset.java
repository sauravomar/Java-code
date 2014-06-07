package Dp;

import java.util.Stack;

/**
 * Created by saurav on 2/6/14.
 */


public class GetAllSubset {

    public static final int TARGET_SUM = 15;
    private Stack<Integer> stack = new Stack<Integer>();
    private int sumInStack = 0;

    public void populateSubset(int[] data, int fromIndex, int endIndex) {

        if (sumInStack == TARGET_SUM) {
            print(stack);
        }

        for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {

            if (sumInStack + data[currentIndex] <= TARGET_SUM) {
                stack.push(data[currentIndex]);
                sumInStack += data[currentIndex];

                populateSubset(data, currentIndex + 1, endIndex);
                sumInStack -= (Integer) stack.pop();
            }
        }
    }

    private void print(Stack<Integer> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(TARGET_SUM).append(" = ");
        for (Integer i : stack) {
            sb.append(i).append("+");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }

    public static void main(String[] args) {
        final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13, 14, 15 };
        GetAllSubset get = new GetAllSubset();
        get.populateSubset(DATA, 0, DATA.length);
    }
}