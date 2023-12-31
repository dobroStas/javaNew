package homeWork;

public class hw2 {
    public static void main(String[] args) {
        /*
        * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
            Напишите свой код в методе printPrimeNums класса Answer.

            Пример

            1
            2
            3
            5
            7
            11
            ...
            */

        primeNumber();
    }

    static void primeNumber(){
        int upperValue = 100;
        System.out.println("1");
        for (int i = 2; i < upperValue + 1; i++){
                boolean num = false;
                for(int j = 2; i * i < j; j++){
                    num = (j % i == 0);
                    if(num) break;
                    if(!num) System.out.println(j);
                }
        }
    }
            /*
             * перебор чисел от 2 до ста
             * переменная ложь
             * перебор чисел от 2 до произведения первого на себя, 
             *          т. к. в дальнейшем не проверим делится ли 2 на 1 для определения правда или ложь
             * "num" = остаток от деления 2 перебора от первого если делится, то = 0
             * если да, то брейк
             * если нет, значит простое
             */
}



