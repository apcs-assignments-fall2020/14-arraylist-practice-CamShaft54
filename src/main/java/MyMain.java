import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        return list.stream().mapToInt(i -> (Math.abs(i) % 2 == 1) ? 1 : 0).sum();
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().mapToInt(i -> (list2.contains(i)) ? 1 : 0).sum() > 0;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        return (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(countOdd(list));
        ArrayList<Integer> otherList = new ArrayList<>();
        otherList.add(1);
        otherList.add(9);
        System.out.println(checkDuplicates(list, otherList));
        System.out.println(convertToArrayList(new int[]{1, 2, 3 ,4}));
    }
}
