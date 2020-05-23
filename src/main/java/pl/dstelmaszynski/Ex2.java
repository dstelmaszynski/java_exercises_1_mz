package pl.dstelmaszynski;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void somestuff(){

        //tworzenie ArrayList
        List<Integer> someList = new ArrayList<Integer>();

        //dodawanie elementow do ArrayList
        someList.add(7);
        someList.add(32);
        someList.add(5);

        //wyświetlanie elementu przez index
        System.out.println(someList.get(0));
        System.out.println(someList.get(2));

    }
    public static void main (String[] args){
        somestuff();
    }
}
