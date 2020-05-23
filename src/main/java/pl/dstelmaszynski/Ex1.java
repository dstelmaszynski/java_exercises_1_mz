package pl.dstelmaszynski;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ex1 {


    private int [] table = new int[10];

    public Ex1()
    {
        insterToTable();
        showTable();
    }

    public void insterToTable()
    {
        System.out.println("1a. Dodano do tablicy " + table.length + "elementow.");
        for( int i = 0; i < table.length; i++ ) table[i] = i + 1;
    }

    public void showTable()
    {
        System.out.println("1b. Table lenght:" + table.length);
        System.out.print("1c \n| ");
        for( int i = 0; i < table.length; i++ ) System.out.print( table[i] + " | ");
        System.out.print("\n1d+e \n| ");
        for( int i = 0; i < table.length; i++ )
        {
            table[i] = i*2;
            System.out.print( table[i] + " | ");
        }
    }
public static void main (String[] args){
        Ex1 ex1 = new Ex1();
}
}




//    public static void table (){
//
//        List<Integer> someList = new LinkedList<>();
//
//        int numbers;
//        for (numbers = 1; numbers < 10; numbers++){
//
//        }
//        int someTab [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        someList.addAll(someTab);
//
//        for (int i = 1; i <= 10; i ++){
//            someTab[i] = i + 1;
//        }
//        System.out.println(someTab.length);
//
//    }
//    public static void main (String[] args){
//        table();
//    }

