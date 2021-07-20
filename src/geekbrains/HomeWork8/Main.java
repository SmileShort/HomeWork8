package geekbrains.HomeWork8;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //new MyWindow();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String  hiddenWold = words[random.nextInt(words.length)];
        //System.out.println(hiddenWold);

        System.out.println("Компьютер загадал фрукт/овощ, который очень хочет попробовать! Попробуйте угадать его...");
        System.out.println("Какой фрукт/овощ загадал компьютер? ");
        String answerWord = scanner.nextLine();

        char [] asterisk = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};
        while (!hiddenWold.equals(answerWord)){
            System.out.println("Вы не угадали...");
            System.out.println("Введите предполагаемый ответ!");
            answerWord = scanner.nextLine();

             for (int i = 0; i < hiddenWold.length(); i++){
                 if (answerWord.charAt(i) == hiddenWold.charAt(i)){
                     asterisk[i] = hiddenWold.charAt(i);
                 }
             }
            System.out.println(asterisk);
        }
        System.out.println("Поздравляю!!! Вы угадали слово!!!");
    }
}
