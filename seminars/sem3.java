package seminars;

import java.util.ArrayList;
import java.util.Random;

public class sem3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Random random = new Random();
        System.out.println(random.nextInt( 10 ,60 ));   
        Collections.sort(new ArrayList<>());
        Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
         */





        // System.out.println(randomNumbers(10).toString());



        ArrayList ls = new ArrayList<>();
        ls.add(6);
        ls.add("tetx");
        ls.add("8");
        for (int i = 0; i < ls.size(); i++) {
            if(ls.get(i) instanceof Integer) ls.remove(i);
        }
        System.out.println(ls);
        /*
         * ArrayList Test = new ArrayList(List.of( 123, "Венера", 333, 4444, "Zemlya"));
        var n = Test.size();
        var temp = 0;
        for (int i = n-1; i >= 0; i-- ) {
            if (Test.get(i) instanceof Integer) {
                Test.remove(i);
                temp = n;
            }

        }
        System.out.println(Test);

//        System.out.println(temp);
    }


}
         */

         
        /*
         * Создать список типа ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
         * 
        

       
       
         /
        
        *
        

        

        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

        import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>(List.of("Меркурий", "Венера"));
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");

        int n = 10;
        var random = new Random();
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i < n; i++) {
            var planet = planets.get(random.nextInt(0, planets.size()));
            list.add(planet);
        }
        System.out.println(list);

        Map<String, Integer> planetTimes = new HashMap<>();

        for (var planet : list) {
            if (!planetTimes.containsKey(planet)) {
                planetTimes.put(planet, 1);
            }
            else {
                var temp = planetTimes.get(planet);
                planetTimes.put(planet, temp + 1);
            }
        }
        System.out.println(planetTimes);

        Set<String> filteredList = new LinkedHashSet<>(list);
        System.out.println(filteredList);
    }
}

21:19

         */
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Земля");
        arr.add("Меркурий");
        arr.add("Марс");
        arr.add("Венера");
        arr.add("Юпитер");


        /*
         * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
         */



    
    //   public static ArrayList<Integer> randomNumbers(int N){
    //     ArrayList<Integer> arrayList = new ArrayList<>();
    //         Random random = new Random();
    //         for (int i = 0; i < N; i++) {
    //             arrayList.add(random.nextInt(1,100));
    //         }
    //     Collections.sort(arrayList);
    //     return arrayList;
    //     }
}
}
