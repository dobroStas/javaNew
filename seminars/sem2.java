package seminars;

import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) {
        String a = "hello";                         //изменяем строку а не создаем новую
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" world");          //добовляем текс
        // System.out.println(sb);          // выводим на экран
                                // массив toString() вроде




        int n = 6;
     String c = "c1";
     String d = "c2";
    //  cheredovanie(n, c, d);

     String f = "aaaabbbcddf";
    // symbol(f);
    // symbol1(f);

    //  PALINDROM
    testProd();

    // StringBuilder data = new StringBuilder("adfg");
    // StringBuilder st = new StringBuilder(data.reverse());
    // System.out.println(data.equals(st));


    // String input = "A man a plan a canal Panama";
    // boolean result = isPalindrome(input);
    // System.out.println("Is palindrome: " + result); // Вывод: "Is palindrome: true"
}
    
    

   static void cheredovanie(int n, String c, String d){
    /*
     * Дано четное число N (>0) и символы c1 и c2. 
     * Написать метод, который вернет строку длины N, 
     * которая состоит из чередующихся символов c1 и c2, начиная с c1.   
     */
    StringBuilder sb = new StringBuilder(" ");  // создаем новую пустую строку
        for (int i = 0; i < n / 2; i++) {
            // if(n % 2 == 0)
            sb.append(c).append(d);         //добавляем в строку С и В
        }
        System.out.println(sb);
   }    

   static void symbol(String f){
    /*
    * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
    */
    StringBuilder sb1 = new StringBuilder();  
    for (int i = 0; i < f.length() - 1; i++) {
        if(f.charAt(i) != f.charAt(i + 1)) sb1.append(f.charAt(i));
        else continue;
        }
    sb1.append(f.charAt(f.length() - 1)) ;
    System.out.println(sb1);
   }

   static void symbol1(String a){
    StringBuilder compressed = new StringBuilder();
    char currentChar = a.charAt(0);

    for (int i = 1; i < a.length(); i++) {
        char nextChar = a.charAt(i);
        if (nextChar != currentChar) {
            compressed.append(currentChar);
        currentChar = nextChar;
        }
    }
    compressed.append(currentChar);
    System.out.println(compressed.toString());
   }
   
static boolean isPalindrome(String input) {
return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
}

   static boolean palindrome(String input) {
     /*
     * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
     */
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter to string polydrom: ");

    // // String n = sc.nextLine();
    // StringBuilder sb = new StringBuilder("a bb c bb a");
    // StringBuilder reverse_sb = new StringBuilder(sb.reverse());
    // if(sb.equals(reverse_sb)) System.out.println("true");
    // else System.out.println("false");

    // for (int i = 0; i < words.length / 2; i++) {
    //     if(words[i] == )
    // }


    // while(swap){
    //     boolean swap = false;
    //     for (int i = 0; i < words.length / 2; i++) {
    //         if(words[i] == words[words.length - 1 - i]) swap = true;
    // }
    // if(!swap) System.out.println("true");
    // else System.out.println("false");
    
    // }
    return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
    }

    static void palindrom2(String[] args) {
        StringBuilder str = new StringBuilder("арозаупаланалапуазора");
        StringBuilder reverse_str = new StringBuilder(str);
        reverse_str.reverse();
        
        String str_st = str.toString();
        String reverse_str_st = reverse_str.toString();
        
        if (str_st.equals(reverse_str_st)) {
        System.out.println("YES");
        }
        else {
        System.out.println("NO");
        }
        
        System.out.println(str);
        System.out.println(reverse_str);
        
        
        
        }
        

    static void testProd(){
/*
         * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
         * который запишет эту строку в простой текстовый файл, обработайте исключения.
         */

        try {
            FileWriter fWriter = new FileWriter("test2.txt");
            for (int i = 0; i < 100; i++) {
                fWriter.write("test ");
                fWriter.flush();

                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        


         /*
          * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
           *Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
           * Обработайте ошибки с помощью try-catch конструкции. 
           * В случае возникновения исключения, оно должно записаться в лог-файл.
          */



}
