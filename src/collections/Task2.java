package collections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Создайте программу на Java для работы с коллекцией строк.
Заполните коллекцию строками произвольного содержания (не менее 5 строк).
Выведите все строки из коллекции, содержащие не менее 5 символов.
Выберите любую букву и выведите количество строк, начинающихся с этой буквы.
Удалите из коллекции все строки, которые состоят только из цифр.
Выведите результат после всех операций.*/
public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("afe%3*h");
        list.add("746h");
        list.add("aiuio");
        list.add("1345678");
        list.add("privet");
        for (String i : list) {
            if (i.length() > 4) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        Pattern pattern = Pattern.compile("^a");
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        pattern = Pattern.compile("\\d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                iterator.remove();
            }
        }
        for (String i : list) {
            System.out.print(i + " ");
        }
    }
}
