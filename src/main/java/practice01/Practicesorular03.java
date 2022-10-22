package practice01;

import java.util.Arrays;

public class Practicesorular03 {
    public static void main(String[] args) {


        class ArrayTest {

            public void main(String[] args) {

                int array[] = {32, 32, 3, 3, 4, 5, 6, 88, 98, 9, 9, 9, 9, 9, 9, 1, 2, 3, 4, 5, 6, 4, 3, 7, 7, 8, 8, 88, 88};

                Arrays.sort(array);
                for (int i = 0; i < array.length - 1; i++) {
                    if ((array[i]) == (array[i + 1]) && (i == 0 || (array[i]) != (array[i - 1]))) {
                        System.out.println("element occuring twice are:" + array[i]);
                    }
                }
            }
        }
    }
}