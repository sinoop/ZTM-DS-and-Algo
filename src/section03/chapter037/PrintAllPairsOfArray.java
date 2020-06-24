package section03.chapter037;

import java.util.Arrays;
import java.util.List;

public class PrintAllPairsOfArray {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> inputArray = Arrays.asList(a);
        inputArray.forEach(
                i -> inputArray.forEach(
                        j -> System.out.println(i + " " + j))
        );
    }

}
