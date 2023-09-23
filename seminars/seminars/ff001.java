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

    import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ff001 {

    public static void main(String[] args) {
        List<Entry> entries = List.of(
                new Entry("Анна", "12345"),
                new Entry("Анна", "67890"),
                new Entry("Борис", "11111"),
                new Entry("Анна", "54321"),
                new Entry("Дмитрий", "99999"),
                new Entry("Борис", "22222"),
                new Entry("Виктор", "33333")
        );

        System.out.println(getSortedPhoneBook(entries));
    }

    public static List<Map.Entry<String, Set<String>>> getSortedPhoneBook(List<Entry> entries) {
        Map<String, Set<String>> phoneBookMap = new HashMap<>();

        for (Entry entry : entries) {
            phoneBookMap.computeIfAbsent(entry.name, k -> new HashSet<>()).add(entry.phone);
        }

        List<Map.Entry<String, Set<String>>> phoneBookList = new ArrayList<>(phoneBookMap.entrySet());
        phoneBookList.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        return phoneBookList;
    }

    static class Entry {
        String name;
        String phone;

        Entry(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
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


// Четвертое задание:
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.

// Если общего префикса нет, вернуть пустую строку "".