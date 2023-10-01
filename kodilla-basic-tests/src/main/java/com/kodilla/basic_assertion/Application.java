package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subResult = calculator.sub(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3,subResult);
        if (correct1){
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squaredResult = calculator.squared(a);
        boolean correct2 = ResultChecker.assertEquals(25,squaredResult);
        if (correct2){
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
        }
        int squared2Result = (int) calculator.squared2(a);
        boolean correct3 = ResultChecker.assertEquals(25,squared2Result);
        if (correct3){
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
        }
    }
}
