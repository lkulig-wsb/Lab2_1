import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Zad.2
        System.out.println("=== LAB2_1 ===");
        Scanner scanner = new Scanner(System.in);
        //Deklaracja zmiennych i wprowadzenie ich wartości za pomocą Scanner
        System.out.println("Zad.2");
        System.out.println("--------------------------------------");
        System.out.println("Wprowadź wartość dla zmiennej double: ");
        double zmiennaDouble = scanner.nextDouble();
        System.out.println("Wprowadź wartość dla zmiennej int: ");
        int zmiennaInt = scanner.nextInt();
        System.out.println("Wprowadź wartość dla zmiennej char: ");
        char zmiennaChar = scanner.next().charAt(0);
        System.out.println("Wprowadź wartość dla zmiennej boolean: ");
        boolean zmiennaBool = scanner.nextBoolean();
        //Konwersja wartości zmiennych przy pomocy operatorów rzutowania.
        //Operator rzutowania (int) zmienia typ dla zmiennaDouble, z double na int.
        //Zmienna konwersjaDoubleInt służy do przechowania liczby po konwersji, a następnie
        //jest użyta do wyświetlenia konwersji. Podobna zasada dla pozostałych konwersji.
        int konwersjaDoubleInt = (int)zmiennaDouble;
        double konwersjaIntDouble = (double) zmiennaInt;
        int konwersjaCharInt = (int)zmiennaChar;
        String konwersjaBoolString = String.valueOf(zmiennaBool);
        //Wyświetlenie konwersji.
        System.out.println("Konwersja");
        System.out.println("-----------------------------------");
        System.out.println("Konwersja double na int: " + konwersjaDoubleInt);
        System.out.println("Konwersja int na double: " + konwersjaIntDouble);
        System.out.println("Konwersja char na int: " + konwersjaCharInt);
        System.out.println("Konwersja bool na String: " + konwersjaBoolString);
        scanner.close();
        //Zad.3 Utworzenie dwóch tablic wypełnionych liczbami.
        System.out.println("\nZad.3");
        System.out.println("--------------------------------------");
        int[]tablicaPierwsza = {0,2,4,6,8,10};
        int[]tablicaDruga = {1,3,5,7,9,11};
    }
}