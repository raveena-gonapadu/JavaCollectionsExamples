
/*Write a program to add to numbers into a single array
input: array1 = {1,3,5)
array2 = {2,4,7,9}
output: finalArray = {1,3,5,2,4,7,9}*/

import java.util.ArrayList;
import java.util.List;

public class CombineArrays {

    public void combine(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        System.out.println("Combined List: "+combinedList);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(7);
        list2.add(9);

        CombineArrays combineArrays = new CombineArrays();
        combineArrays.combine(list1,list2);
    }

}
