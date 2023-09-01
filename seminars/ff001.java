package seminars;

// import java.util.Scanner;

// public class ff001 {
//     public static void main(String[] args) {
//         Роман Сухачев
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner inputData = new Scanner(System.in);
//         System.out.println("enter your age: ");
//         int age = inputData.nextInt();
        
//         if (age >= 18){
//             System.out.println("welcome");
//         }else if (age >= 15){
//             System.out.println("sorry you re not allowed");
//         }else {
//             System.out.println("too small, go to school");
//         }



//     }
// }

// 20:29
// Айнур Шамсуллин
// i < 5

// 20:31
// Иванченко Григорий
// а можно ли написать ++i и если да, то что тогда будет?

// 20:31
// Роман Сухачев
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//       for (int i = 0; i<5; ++i){
//             Scanner inputData = new Scanner(System.in);
//             System.out.println("enter your age: ");
//             int age = inputData.nextInt();

//             if (age >= 18) {
//                 System.out.println("welcome");
//             } else if (age >= 15) {
//                 System.out.println("sorry you re not allowed");
//             } else {
//                 System.out.println("too small, go to school");
//             }


//         }
//     }
// }
//     }
    
// }




    // }}


//Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// import java.util.Arrays;

// public class ff001 {
    // public static void main(String[] args) {
    //     var array = new int[] {3, 2, 2, 3, 4,35,3,24,234,4,23,52,2,2,3,3,5,6565,3,55,3};
    //     var val = 3;

    //     boolean swap = true;
    //     while (swap)
    //     {
    //         swap = false;
    //         for (int i=0; i<array.length - 1; i++) {
    //             if (array[i] == 3 && array[i + 1] != 3){
    //                 var temp = array[i + 1];
    //                 array[i + 1] = array[i];
    //                 array[i] = temp;
    //                 swap = true;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.toString(array));
//     }
// }
/*
 * сделал через создание нового массива и записи в него сначала неподходящих чисел,
 * и добавление колличества подходящих с нужного индекса
 * не получилось через "push"!!!!
 */

// 21:47










// Четвертое задание:
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.

// Если общего префикса нет, вернуть пустую строку "".