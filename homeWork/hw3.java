package homeWork;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        /*
         * Напишите класс Calculator, 
         * который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат. 
         * В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
         * При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
         */

         Calculator();

    }


    static void Calculator(){
        double n;
        double m;
        double operator;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number from space: ");// запросили первое число
        n = sc.nextDouble();//считали с клавы через переменную сканера
        System.out.print("Input number from space: ");//запросили второе число
        m = sc.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch(op) {// кейсы оператора
            case '+': operator = n + m;
                break;
            case '-': operator = n - m;
                break;
            case '*': operator = n * m;
                break;
            case '/': operator = n / m;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(n + " " + op + " " + m + " = " + operator);    

    }
}
    
