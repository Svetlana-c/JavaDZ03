import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
// // 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
public class test1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("GB");
        list.add("Pink");
        list.add("New");
        for(String str: list){
            System.out.println(str);
        }     
        };
    }


// // 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
public class test1 {
        public static void main(String[] args){

        }
}


// 3.Вставить элемент в список в первой позиции.
public class test1 {
        public static void main(String[] args){
            ArrayList<String> list = new ArrayList<>();
            list.add("Hello");
            list.add("World");
            list.add("GB");
            list.add("Pink");
            list.add("New");
            list.add(0, "null");
            System.out.println(list);
        }
    }

// 4.Извлечь элемент (по указанному индексу) из заданного списка.
public class test1 {
            public static void main(String[] args){
                ArrayList<String> list = new ArrayList<>();
                list.add("Hello");
                list.add("World");
                list.add("GB");
                list.add("Pink");
                list.add("New");
                System.out.println ("Третий элемент ArrayList:" + list.get (2));
            }
        }

// 5.Обновить определенный элемент списка по заданному индексу.
public class test1 {
        public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("GB");
        list.add("Pink");
        list.add("New");
        list.set(3, "Black");
        System.out.println(list);
        }
}
// 6.Удалить третий элемент из списка.
public class test1 {
        public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("GB");
        list.add("Pink");
        list.add("New");
        list.remove(2);
        System.out.println(list);
        }
}

// 7.Поиск элемента в списке по строке.
public class test1 {
            public static void main(String[] args){
            ArrayList<String> list = new ArrayList<>();
            list.add("Hello");
            list.add("World");
            list.add("GB");
            list.add("Pink");
            list.add("New");
            System.out.println(list.indexOf("GB"));
            }
    }

// 8.Создать новый список и добавить в него несколько элементов первого списка.
public class test1{
        public static void main(String[] args){
            ArrayList<String> list = new ArrayList<>();
                list.add("Hello");
                list.add("World");
                list.add("GB");
                list.add("Pink");
                list.add("Sum");
    
            ArrayList<String> list2 = new ArrayList<>();
            list2.add("eeee");
            list2.add("Sum");
    
            list.addAll(1, list2);
            System.out.println(list);
        }
    }


// 9.Удалить из первого списка все элементы отсутствующие во втором списке.
public class test1{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
            list.add("Hello");
            list.add("World");
            list.add("GB");
            list.add("Pink");
            list.add("Sum");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("eeee");
        list2.add("Sum");

        list.retainAll(list2);
        System.out.println(list);
    }
}

// 10. Сортировка списка
public class test1{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++){
            l1.add(rnd.nextInt(8));
        }
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
    }
}
