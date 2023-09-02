package seminars;

import java.util.Arrays;
import java.util.Scanner;

public class sem1 {
    public static void main(String[] args) {
        // int firstInt = 10;
        // System.out.println(firstInt);
        // String text = "akdjfskdhf";
        // System.out.println(text);


        
        int age = 6;


        if ((age >= 18) & (age < 50))
            System.out.println("hallo");
        
        if (age <= 10) 
            System.out.println("dsd");
        if (age >= 50)
         System.out.println("1212");
        

        // спросить имя
        // String userName = input.nextLine();
        // System.out.printf("hi, %s", userName);


        // // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        //     int [] arr = new int[]{1,1,0,1,1,1};
        //     int count = 0;
        //     int maxCount = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         if (arr[i] == 1){
        //             count ++;
        //             System.out.println(count);
        //         }
                
        //         else if (count > maxCount){
        //             maxCount = count;
        //             count = 0;
        //         }
                
        //     }
        //     if(count > maxCount) System.out.println(count);
        //     else System.out.println(maxCount);


        // Следующее задание: Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        // а остальные - равны ему.



        // int [] array = new int[]{2,4,4,6,2,3,4,5};
        // Scanner input = new Scanner(System.in);
        // // System.out.println("enter U num:");           
        // int num = 4;
        // int []new_arr = new int[array.length];
        // int count = 0;
        // int index = 0;
        // for (int i = 0; i < array.length; i++) {
        //     int temp = array[i];
        //     if(array[i] == num) count++;
        //     else{
        //         new_arr[index] = array[i];
        //         index++;
        //     }
        //     for (int j = 0; j < count; j++) {
        //         new_arr[index  + j] = num;
        //     }
        // }


        // for(int i = 0; i < new_arr.length; i++){
        //     System.out.print(new_arr[i]);
        // }



        int[] nums = {3, 3, 3, 2, 1, 7, 3};
        int value = 2;
        int count = 0;
        while (count < nums.length) {           //цикл крутит все згачения каждый раз по кругу пока не закончится дляна массива
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == value) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(nums));


    }



            





            


        }



// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
