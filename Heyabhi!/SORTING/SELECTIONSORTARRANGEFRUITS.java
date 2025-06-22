package SORTING;

import java.util.Arrays;

public class SELECTIONSORTARRANGEFRUITS {
    static void Sortfruits(String []fruit) {
        int n = fruit.length;
        for (int i = 0; i < n - 1; i++) {
            int minelement = i;
            for (int j = i + 1; j < n; j++) {
                if (fruit[j].compareTo(fruit[minelement]) < 0) {
                    minelement = j;

                }
            }
            String temp = fruit[i];
            fruit[i] = fruit[minelement];
            fruit[minelement] = temp;


        }
    }

    public static void main(String[] args) {
        String [] fruits={"mango","pine","orange","banana","pineapple","grapes"};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(fruits));
        Sortfruits(fruits);
        System.out.println("Array after swaping"+ Arrays.toString(fruits));

    }
}
