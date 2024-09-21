package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main calculator = new Main();
        int result = calculator.add(5, 3);
        System.out.println("The result of 5 + 3 is: " + result);
    }
}