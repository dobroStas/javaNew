package itogovay;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/*
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class itogovaya {
public class Main {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<itogovaya> laptops = new HashSet<>();
        
        // Добавляем ноутбуки в множество
        laptops.add(new itogovaya("HP", 8, 500, "Windows", "Black"));
        laptops.add(new itogovaya("Dell", 16, 1000, "Windows", "Silver"));
        laptops.add(new itogovaya("Apple", 16, 512, "MacOS", "Gray"));
        laptops.add(new itogovaya("Lenovo", 12, 256, "Windows", "Blue"));


        // Запрашиваем критерии фильтрации
        Map<String, Object> filterCriteria = getFilterCriteria();
        
        // Фильтруем и выводим ноутбуки
        Set<itogovaya> filteredLaptops = filterLaptops(laptops, filterCriteria);
        printLaptops(filteredLaptops);
    }

   
    private static Map<String, Object> getFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterCriteria = new HashMap<>();
        
        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        
        // Запрашиваем выбранные критерии у пользователя и сохраняем их в Map
        int numCriteria = scanner.nextInt();
        for (int i = 0; i < numCriteria; i++) {
            System.out.println("Введите номер критерия:");
            int criterion = scanner.nextInt();
            
            if (criterion == 1) {
                System.out.println("Введите минимальный размер ОЗУ:");
                int minRamSize = scanner.nextInt();
                filterCriteria.put("ramSize", minRamSize);
            } else if (criterion == 2) {
                System.out.println("Введите минимальный объем ЖД:");
                int minStorageSize = scanner.nextInt();
                filterCriteria.put("storageSize", minStorageSize);
            } else if (criterion == 3) {
                System.out.println("Введите операционную систему:");
                String operatingSystem = scanner.next();
                filterCriteria.put("operatingSystem", operatingSystem);
            } else if (criterion == 4) {
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filterCriteria.put("color", color);
            }
        }
        
        return filterCriteria;
    }
    
    private static Set<itogovaya> filterLaptops(Set<itogovaya> laptops, Map<String, Object> filterCriteria) {
        Set<itogovaya> filteredLaptops = new HashSet<>();
        
        for (itogovaya laptop : laptops) {
            // Фильтрация по каждому критерию
            boolean meetsAllCriteria = true;
            
            if (filterCriteria.containsKey("ramSize")) {
                int minRamSize = (int) filterCriteria.get("ramSize");
                if (laptop.getRamSize() < minRamSize) {
                    meetsAllCriteria = false;
                }
            }
            
            if (filterCriteria.containsKey("storageSize")) {
                int minStorageSize = (int) filterCriteria.get("storageSize");
                if (laptop.getStorageSize() < minStorageSize) {
                    meetsAllCriteria = false;
                }
            }
            
            if (filterCriteria.containsKey("operatingSystem")) {
                String operatingSystem = (String) filterCriteria.get("operatingSystem");
                if (!laptop.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                    meetsAllCriteria = false;
                }
            }
            
            if (filterCriteria.containsKey("color")) {
                String color = (String) filterCriteria.get("color");
                if (!laptop.getColor().equalsIgnoreCase(color)) {
                    meetsAllCriteria = false;
                }
            }
            
            // Если ноутбук удовлетворяет всем критериям, добавляем его в результат
            if (meetsAllCriteria) {
                filteredLaptops.add(laptop);
            }
        }
        
        return filteredLaptops;
    }
    
    private static void printLaptops(Set<itogovaya> laptops) {
        System.out.println("Результаты фильтрации:");
        for (itogovaya laptop : laptops) {
            System.out.println("Бренд: " + laptop.getBrand());
            System.out.println("ОЗУ: " + laptop.getRamSize());
            System.out.println("Объем ЖД: " + laptop.getStorageSize());
            System.out.println("Операционная система: " + laptop.getOperatingSystem());
            System.out.println("Цвет: " + laptop.getColor());
            System.out.println("------------------------------");
        }
    }

}
    private String brand;
    private int ramSize;
    private int storageSize;
    private String operatingSystem;
    private String color;

    public itogovaya(String brand, int ramSize, int storageSize, String operatingSystem, String color){
        this.brand = brand;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    
    public int getRamSize() {
        return ramSize;
    }
    
    public int getStorageSize() {
        return storageSize;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    public String getColor() {
        return color;
    }
}

    
