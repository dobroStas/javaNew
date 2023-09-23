
package homeWork;
import static printArr;
public class hw4 {
    public static void main(String[] args) {
        // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

        String frase = "Добро пожаловать на курс по Java";
        String[] words = frase.split(" ");
        for(int i = 0; i < (words.length - 1)  / 2; i++){
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
        printArr(words);
    }
}
