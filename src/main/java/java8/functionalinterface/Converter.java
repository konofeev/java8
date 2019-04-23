package java8.functioninterface;

@FunctionalInterface
public interface Converter<F, T>
{
    T convert(F from); 
}
