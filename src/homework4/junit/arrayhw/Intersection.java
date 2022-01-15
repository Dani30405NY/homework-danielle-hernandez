package homework4.junit.arrayhw;

//Array 1: 1, 3, 2, 4, 8, 9, 0
//Array 2: 1, 3, 7, 5, 4, 0, 7, 5

public class Intersection {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};

        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                System.out.println(array1[i]);
                i++;
                j++;
            }
        }
    }
}

