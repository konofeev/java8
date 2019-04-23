import java8.interfacedefault.DefaultMethod;;

public class Main
{
    public static void main(String[] arguments) throws Exception
    {
        System.out.println("Новое в Java 8");

        System.out.println("Методы по умолчанию");
        DefaultMethod defaultMethod = new DefaultMethod(){};
        defaultMethod.getValue();
    }                                 
}
