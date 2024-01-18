package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Создайте программу, которая работает с коллекцией чисел.
В начале программа должна заполнять коллекцию числами от 1 до 10.
Затем выведите все числа из коллекции, умножив каждое число на 2.
Наконец, удалите из коллекции все нечетные числа и выведите результат.*/
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(int i : list) {
            System.out.print(i);
        }
        System.out.println();
        list.removeIf(integer -> integer % 2 != 0);
        for(int i : list) {
            System.out.print(i);
        }
    }
}
