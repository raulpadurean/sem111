package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        MathAufgabe mathAufgabe = new MathAufgabe();
        double x = 3.3;
        double y = 2.5;

        double z = mathAufgabe.add(x,y);
        double c = mathAufgabe.sub(x,y);

        int m=3;

        double n=mathAufgabe.mul(x,m);

        System.out.println(z);
        System.out.println(c);
        System.out.println(n);



        String string = "Hello world";
        StringOps stringOps = new StringOps();
        string = stringOps.reverse(string);
        System.out.println(string);

        int cont;
        cont = stringOps.wordCount(string);
        System.out.println(cont);


        System.out.println(mathAufgabe.isPerfect(4));

        int[] temperatures = new int[]{21,12,20,32,35,31,23,11,32,2,26,28,29,31};
        int[] test = new int[]{1,2,3,4,5};
        Temperature temp = new Temperature(temperatures);
        Temperature temp2 = new Temperature(test);
        System.out.println(temp2.averageTemperature());

        System.out.println(temp2.maxTemperature());
        System.out.println(temp2.minTemperature());
        
    }
}