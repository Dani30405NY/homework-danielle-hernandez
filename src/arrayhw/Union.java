package arrayhw;
import java.util.Arrays;

//Array 1: 1, 3, 2, 4, 8, 9, 0
//Array 2: 1, 3, 7, 5, 4, 0, 7, 5


public class Union {
    public static void main(Sring[] args)

    {
        Integer arr1[] = {1, 3, 2, 4, 8, 9, 0};
        Integer arr2[] = {1, 3, 7, 5, 4, 0, 7, 5};

        UnionArray.getUnion(arr1, arr2);
    }
    private static void getUnion(Integer[] arr1, Integer[] arr2) {
        Integer[] firstArray = arr1;
        Integer[] secondArray = arr2;

        List <Integer> firstList = Arrays.aslist(firstArray);
        List <Integer> secondList = Arrays.asList(secondArray);

        Set <Integer> set=new HashSet<Integer>();
        set.addAll(firstList);
        set.adAll(secondList);

        System.out.println(set);
        Integer[] union={}
        union = set.toArray(union);

        System.out.println("Union!")
        System.out.println(Array.toSting(union));
    }
}
