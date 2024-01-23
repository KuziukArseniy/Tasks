package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/*
Ваша задача - написать программу, которая считает количество вхождений каждого слова в предложении.
Программа должна использовать HashMap для хранения пар "слово - количество вхождений".
После обработки предложения, программа должна вывести на экран каждое слово и количество его вхождений.
Пример ввода:

"java is a programming language, java is object-oriented, java is versatile"
Пример вывода:
java: 3
is: 3
a: 1
programming: 1
language: 1
object-oriented: 1
versatile: 1
*/
public class Task3 {
    public static void coutWords(String string) {
        String[] words = splitString(string);
        HashMap<Integer, String> hashMap = (HashMap<Integer, String>) inputMap(words);
        System.out.println(hashMap.get(0) + ": " + getCount(hashMap, words[0]));
        for (int i = 0; i < hashMap.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (hashMap.get(i).equals(hashMap.get(j))) {
                    break;
                } else if (j == i - 1) {
                    System.out.println(hashMap.get(i) + ": " + getCount(hashMap, words[i]));
                }
            }
        }
    }

    private static int getCount(Map<Integer, String> map, String word) {
        int count = 0;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).equals(word))
                count++;
        }
        return count;
    }

    private static Map<Integer, String> inputMap(String[] words) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(i, words[i]);
        }
        return map;
    }

    private static String[] splitString(String string) {
        Pattern pattern = Pattern.compile("\\W+");
        return string.split(pattern.pattern().trim());
    }
}
