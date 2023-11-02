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
        //Obliczenie średniej wartości dla każdej z tablic
        //Za pomocą polecenia Arrays.stream(nazwaTablicy) tworzymy strumień elementów tablicy, który umożliwia nam
        //wykonywanie różnych operacji, takich jak average(), czyli obliczenie średniej elementów tablicy.
        //getASDouble() - zwraca średnią jako double
        double sredniaTablicaPierwsza = Arrays.stream(tablicaPierwsza).average().getAsDouble();
        double sredniaTablicaDruga = Arrays.stream(tablicaDruga).average().getAsDouble();
        //Wypisanie średniej dla każdej z Tablic
        System.out.println("Średnia dla tablicaPierwsza[]: " + sredniaTablicaPierwsza);
        System.out.println("Średnia dla tablicaDruga[]: "+ sredniaTablicaDruga);
        //Utworzenie kopii istniejących tablic za pomocą metody Arrays.copyOf, i parametru nazwaTablicy.length który
        //określa że kopia tablicy ma mieć taki sam rozmiar jak oryginalna tablica.
        int[]kopiaTablicaPierwsza = Arrays.copyOf(tablicaPierwsza,tablicaPierwsza.length);
        int[]kopiaTablicaDruga = Arrays.copyOf(tablicaDruga, tablicaDruga.length);
        //Wyświetlenie wszystkich elementów kopi Tablic przy pomocy strumienia (Arrays.stream) i metody forEach.
        System.out.print("kopiaTablicaPierwsza[]: ");
        Arrays.stream(kopiaTablicaPierwsza).forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.print("kopiaTablicaDruga[]: ");
        Arrays.stream(kopiaTablicaDruga).forEach(element -> System.out.print(element + " "));
        //Filtrowanie tablic. Znalezienie elementów które spełniają określone kryterium, a następnie wpisanie ich do nowej tablicy.
        //Utworzenie strumienia elem. tablic, a następnie za pomocą operacji filter(element -> element >= wartoscDlaKryterium)
        //wybieramy te elementy które spełniają wspomniany warunek. toArray() przekształca filtrowany strumień z powrotem na tablicę.
        int wartoscDlaKryterium = 5;
        int[]przefiltrowanaTablicaPierwsza = Arrays.stream(tablicaPierwsza).filter(element -> element >= wartoscDlaKryterium).toArray();
        int[]przefiltrowanaTablicaDruga = Arrays.stream(tablicaDruga).filter(element -> element >= wartoscDlaKryterium).toArray();
        //Wyświetlenie przefiltrowanych elementów w nowych tablicach.
        System.out.println();
        System.out.print("przefiltrowanaTablicaPierwsza[]: ");
        Arrays.stream(przefiltrowanaTablicaPierwsza).forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.print("przefiltrowanaTablicaDruga[]: ");
        Arrays.stream(przefiltrowanaTablicaDruga).forEach(element -> System.out.print(element + " "));
        //Usunięcie określonego elementu z tablicy i utworzenie nowej tablicy bez tego elementu.
        System.out.println();
        //Wyświetlane są elementy tablicy tablicaPierwsza.
        System.out.print("tablicaPierwsza[]: ");
        Arrays.stream(tablicaPierwsza).forEach(element -> System.out.print(element + " "));
        //Użytkownik proszony jest o wprowadzenie elementu, który ma zostać usunięty z tablicy przy pomocy metody wprowadzania
        //liczb całkowitych scanner.nextInt()
        System.out.print("\nKtóry elemnt usunąć z tablicaPierwsza[]: ");
        int elementDoUsuniecia = scanner.nextInt();
        //Utworzenie nowej tablicy która zawiera elementy z tablicaPierwsza ale bez elementu który jest równy 'elementDoUsuniecia'
        //Operacja .filter sprawdza każdy element strumienia i zwraca tylko te elementy które nie są równe 'elementDoUsuniecia'.
        //W przypadku równości element będzie odrzucany.
        int[] nowaTablicaPierwsza = Arrays.stream(tablicaPierwsza).filter(element -> element != elementDoUsuniecia).toArray();
        System.out.print("nowaTablicaPierwsza[]: ");
        Arrays.stream(nowaTablicaPierwsza).forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.print("tablicaDruga[]: ");
        Arrays.stream(tablicaDruga).forEach(element -> System.out.print(element + " "));
        System.out.print("\nKtóry elemnt usunąć z tablicaDruga[]: ");
        int elementDoUsuniecia2 = scanner.nextInt();
        int[] nowaTablicaDruga = Arrays.stream(tablicaDruga).filter(element -> element != elementDoUsuniecia2).toArray();
        System.out.print("nowaTablicaDruga[]: ");
        Arrays.stream(nowaTablicaDruga).forEach(element -> System.out.print(element + " "));



        scanner.close();

    }

}