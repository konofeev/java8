package java8.interfacedefault;

/**
 * Интерфейс для демонстрации метода по умолчанию
 */
public interface DefaultMethod
{
    /**
     * Метод по умолчанию - получить значение
     */
    default String getValue()
    {
        return "DefaultMethod: метод по умолчанию.";
    }
}
