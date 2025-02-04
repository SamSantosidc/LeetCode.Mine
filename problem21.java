package leetCode;

import java.util.ArrayList;
import java.util.List;

public class problem21 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> combinedList = mergeTwoLists(list1, list2);

        System.out.println(combinedList);
    }

    private static ArrayList<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> combinedList = new ArrayList<>();

        for (int num : list1) {
            combinedList.add(num);
        }
        for (int num : list2) {
            combinedList.add(num);
        }

        for (int i = 0; i < combinedList.size() - 1; i++) {
            for (int j = 0; j < combinedList.size() - 1 - i; j++) {
                if (combinedList.get(j) > combinedList.get(j + 1)) {
                    int temp = combinedList.get(j);
                    combinedList.set(j, combinedList.get(j + 1));
                    combinedList.set(j + 1, temp);
                }
            }
        }

        return combinedList;
    }
}
