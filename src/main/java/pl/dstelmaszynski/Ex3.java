package pl.dstelmaszynski;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void doubleNumbers (){
        //tworzenie ArrayList - jest Double, bo zmiennoprzecinkowe
        List<Double>doubleArray = new ArrayList<>();

        //dodawanie zmiennych
        doubleArray.add(1.6);
        doubleArray.add(0.4);
        doubleArray.add(2.8);
        doubleArray.add(9.1);
        doubleArray.add(7.3);
        doubleArray.add(4.6);
        doubleArray.add(5.2);
        doubleArray.add(0.2);
        doubleArray.add(7.9);
        doubleArray.add(3.4);

        //drukowanie ze wskazaniem indexu
        System.out.println(doubleArray.get(0)+ " + " + doubleArray.get(9) + " = " + (doubleArray.get(0) + doubleArray.get(9)));
        System.out.println(doubleArray.get(0)+ " * " + doubleArray.get(9) + " = " + (doubleArray.get(0) * doubleArray.get(9)));
        System.out.println(doubleArray.get(1)+ " / " + doubleArray.get(8) + " = " + (doubleArray.get(1) / doubleArray.get(8)));

    }
    public static void main (String[] args){
        doubleNumbers();
    }
}
