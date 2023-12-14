

/*3. Given the list of numbers, write a program to find whether a given number is present in the list or not
input:
numbers list = {34, 67, 81, 97, 45, 54, 90, 83}
search number = 54
output:
Given number is present in the list*/

import java.util.LinkedList;

public class SearchList {

    public void searchResult(LinkedList<Integer> list, int searchNum)
    {
        boolean found=false;
        int counter = -1;
        for(Integer integer : list)
        {
            counter++;
            if(integer == searchNum) {
                System.out.println("Given number " + searchNum + " is present in the list");
                System.out.println("Index of search element "+searchNum+" is: "+counter);
                found = true;
            }
        }
        if(!found)
            System.out.println("Given number "+searchNum+" is NOT present in the list");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(67);
        list.add(81);
        list.add(97);
        list.add(45);
        list.add(54);
        list.add(90);
        list.add(83);

        SearchList searchList = new SearchList();

        searchList.searchResult(list,54);
        searchList.searchResult(list,40);
    }

}
