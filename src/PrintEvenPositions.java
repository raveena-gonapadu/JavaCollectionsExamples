
/*Given an array of integers, write a program to print all the number at even position
input: {34, 67, 81, 97, 45, 54, 90, 83}
output: 67 97 54 83*/

import java.util.ArrayList;
import java.util.List;

public class PrintEvenPositions {

    public void printEven(List<Integer> list){
        for(int i = 0;i<list.size();i++)
        {
            if((i+1)%2==0)
                System.out.print(list.get(i)+"  ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(67);
        list.add(81);
        list.add(97);
        list.add(45);
        list.add(54);
        list.add(90);
        list.add(83);

        PrintEvenPositions printEvenPositions = new PrintEvenPositions();
        printEvenPositions.printEven(list);
    }

}
