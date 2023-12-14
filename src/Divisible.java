
/*Given a array of numbers, write a program to find out the number of integers which are divisible by 2, 3 and 5
input: {34, 67, 81, 97, 45, 54, 90, 83}
output:
Count of numbers divisible by 2: 3
Count of numbers divisible by 3:
Count of numbers divisible by 5:*/

import java.util.ArrayList;
import java.util.List;

public class Divisible {
    public void divisibility(List<Integer> list)
    {
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;

        for(Integer integer : list)
        {
            if(integer%2 == 0)
                count2++;
            if(integer%3 == 0)
                count3++;
            if(integer%5 == 0)
                count5++;
        }
        System.out.println("Count of integers divisible by 2: "+count2);
        System.out.println("Count of integers divisible by 3: "+count3);
        System.out.println("Count of integers divisible by 5: "+count5);
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

        Divisible divisible = new Divisible();
        divisible.divisibility(list);
    }
}
