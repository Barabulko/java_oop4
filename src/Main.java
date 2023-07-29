// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static <T> void printElement(T element) {
        System.out.print(element + " ");
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            printElement(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Hello", "World", "Java"};

        System.out.println("Integer Array:");
        printArray(integerArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("String Array:");
        printArray(stringArray);
    }

}