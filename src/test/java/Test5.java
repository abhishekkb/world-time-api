import java.util.ArrayList;
import java.util.List;

public class Test5 {

    /**
     *
     *
     */
    public static void main(String[] args) {

        List<Integer> arr1 = List.of(7,8,1,2,3);
        List<Integer> arr2 = List.of(5,6,7,8,9);

        List<Integer> arr3 = new ArrayList<>();
        int n =5;
        for (int i = 0; i < n; i++) {
            arr3.add(i, arr1.get(i) + arr2.get(n-i-1));
        }
        System.out.println(arr3);
    }

}
