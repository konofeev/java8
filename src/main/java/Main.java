import java8.interfacedefault.DefaultMethod;;
import java8.lambdaexpression.SortArray;

import java.util.Arrays;

public class Main
{
    public static void main(String[] arguments) throws Exception
    {
        System.out.println("[Новое в Java 8]");

        System.out.println("[Методы по умолчанию]");
        DefaultMethod defaultMethod = new DefaultMethod(){};
        defaultMethod.getValue();

        System.out.println("[Лямбда выражения. Сортировка]");
        SortArray.oldSort(Arrays.asList("bds", "abc", "amc", "lsd", "jkl"));
        SortArray.newSort(Arrays.asList("bds", "abc", "amc", "lsd", "jkl"));
        SortArray.newSort2(Arrays.asList("bds", "abc", "amc", "lsd", "jkl"));
        SortArray.newSort3(Arrays.asList("bds", "abc", "amc", "lsd", "jkl"));
    }                                 
}
