package homework4.junit.arrayhw;
import java.util.HashSet;
//Array 1: 1, 3, 2, 4, 8, 9, 0
//Array 2: 1, 3, 7, 5, 4, 0, 7, 5

public class Set {
    public static void main(String[] args) {
        int [] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7,5,4, 0, 7, 5};

        set<int> set = new HashSet<>(Arrays.asList(array1,array2));
        System.out.println("The set is: " + set);

    }
}
