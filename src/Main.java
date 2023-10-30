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
        //Obliczenie sumy wszystkich elementów każdej z tablic (bez użycia pętli).
        //Arrays.stream tworzy strumień z elem. tablic 'tablicaPierwsza', 'tablicaDruga',
        //a następnie, przy pomocy operacji .sum(), oblicza sumę wszystki elem. z poszczególnej tablicy.
        int sumaTablicaPierwsza = Arrays.stream(tablicaPierwsza).sum();
        int sumaTablicaDruga = Arrays.stream(tablicaDruga).sum();
        //Wyświetlenie sumy wszystkich elementów dla poszczególnej tablicy za pomocą strumienia wyjścia System.out
        System.out.println("Suma tablicaPierwsza[]: " + sumaTablicaPierwsza);
        System.out.println("Suma tablicaDruga[]: " + sumaTablicaDruga);
        //Znalezienie maksymalnej i minimalnej wartości dla każdej z tablic.
        int maxTablicaPierwsza = Arrays.stream(tablicaPierwsza).max().getAsInt();
        int minTablicaPierwsza = Arrays.stream(tablicaPierwsza).min().getAsInt();
        int maxTablicaDruga = Arrays.stream(tablicaDruga).max().getAsInt();
        int minTablicaDruga = Arrays.stream(tablicaDruga).min().getAsInt();
        //Wypisanie max i min dla każdej z tablic.
        System.out.println("MAX/MIN");
        System.out.println("Max tablicaPierwsza: " + maxTablicaPierwsza);
        System.out.println("Min tablicaPierwsza: " + minTablicaPierwsza);
        System.out.println("Max tablicaDruga: " + maxTablicaDruga);
        System.out.println("Min tablicaDruga: " + minTablicaDruga);
    }
}