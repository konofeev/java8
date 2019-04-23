package java8.lambdaexpression;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortArray
{
    public static void oldSort(List<String> list)
    {
        System.out.println("Сортировка по старому");
        print("Исходный список: ", list);

        Collections.sort
        (
            list, 
            new Comparator<String>()
            {
                 @Override
                 public int compare(String a, String b)
                 {
                     return a.compareTo(b);
                 }
            }
        );

        print("Отсортированный список: ", list);
    }

    public static void newSort(List<String> list)
    {
        System.out.println("Сортировка по новому");
        print("Исходный список: ", list);

        // полная форма лямбда-выражения
        Collections.sort
        (
            list,
            (String a, String b) ->
            {
                return a.compareTo(b);
            }
        );

        print("Отсортированный список: ", list);
    }

    public static void newSort2(List<String> list)
    {
        System.out.println("Сортировка по новому");
        print("Исходный список: ", list);

        // сокращённая форма лямбда-выражения
        Collections.sort(list, (String a, String b) -> a.compareTo(b));

        print("Отсортированный список: ", list);
    }
    
    public static void newSort3(List<String> list)
    {
        System.out.println("Сортировка по новому");
        print("Исходный список: ", list);

        // сокращённая форма лямбда-выражения с выведением типов
        Collections.sort(list, (a, b) -> a.compareTo(b));

        print("Отсортированный список: ", list);
    }

    private static void print(String message, List<String> list)
    {
        System.out.print(message);
        for (String element: list)
        {
            System.out.print(element + "; ");
        }
        System.out.println();
    }
}
