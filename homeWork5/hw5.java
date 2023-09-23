package homeWork5;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//  их необходимо считать, как одного человека с разными телефонами.
//  Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import comporatorTest.comporatorTest.Message;

import java.util.Map.Entry;


     public class hw5 implements Comparable<Map>{
         public static void main(String[] args) {

        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();


        addNumber("Ivanov", 123, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 546585, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);

        printBook((bookPhone));

        Comparator<Integer> comparator = new Comparator<Integer>(){
            public int compare(Message o1, Message o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
            
    }



    //    Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> phoneBook){
        for (var item : phoneBook.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    
    // // // Метод, который сортирует контакты по колличесву номеров
    
    
    // public static void comparator(HashMap(String str, Integer int)){
    //     List<String> list = new ArrayList<>(bookPhone);
    //     List<Map.Entry<Integer, String>> entryList = new ArrayList<>(bookPhone.entrySet());
    //     System.out.println(phoneBook.getValue().size());

        @Override
        public int compareTo(hw5 o){
            return this.bookPhone.value().size - o.bookPhone.value().size
        }

    @Override
    public int compareTo(Map o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
    class Contact{
            String name;
            String surName;

            public Contact(String name, String surName){
                this.name = name;
                this.surName = surName;
            }


            @Override
            public String toString(){
                return "Contact{" + name + " " + surName + "}" ;
            }

            @Override
            public boolean equals (Object o){
                if(this == o) return true;
                if(o == null || getClass() != o.getClass()) return false;
                Contact contact = (Contact) o;
                return surName== contact.surName && Objects.equals(name, contact.name);
            }

            
        }