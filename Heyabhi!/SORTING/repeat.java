package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
class repeat {
    static ArrayList<Integer> repet(int [] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer> unique = new ArrayList<>();
        for (int number : numbers) {
            if (unique.contains(number)) {
                continue;
            } else {
                unique.add(number);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int [] numbers={1,2,2,2,3,4};
        System.out.println(repet(numbers));
    }
}
