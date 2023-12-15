
/*Write a program to print the common elements in two arrays
input:
array1 = {1,3,6,2}
array2 = {3,1,5,4}
output:
array = {1,3}*/

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public void printCommon(List<Integer> l1, List<Integer> l2){
        System.out.print("Common elements: ");
        for (Integer integer : l1) {
            if (l2.contains(integer)) {
                System.out.print(integer + " ");
                l2.remove(integer);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(6);
        l1.add(24);
        l1.add(256);
        l1.add(76);
        l1.add(2);
        l1.add(1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(1);
        l2.add(5);
        l2.add(4);
        l2.add(62);
        l2.add(2);

        CommonElements commonElements = new CommonElements();
        commonElements.printCommon(l1,l2);
    }

}
