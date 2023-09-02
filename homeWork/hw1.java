package homeWork;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
/*
N-ое треугольное число
Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

Пример
n = 4 -> 10
n = 5 -> 15
*/
triangularТumber();

    }

static void triangularТumber(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 'n': ");
    int n = sc.nextInt();
    int res = 0;
    for (int i = 0; i <= n; i++) {
        if(n > 0) res += i;
        else System.out.println("n > 0 only. try again");
    }
    System.out.println(res);
    sc.close();
    }

}
