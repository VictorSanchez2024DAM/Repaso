import java.util.Comparator;
import java.util.function.*;
import java.util.*;

public interface Printable {

    // public static final
    //final ---> constante
    int NUM_PAGES = 2;

    // public abstract
    String print(int data, String data2);


}

class TestPrintable{
    public static void main(String[] args) {
        Printable p = (x, x1) -> "Estoy en clase de ADA";

        Predicate<Integer> pre = x -> x == 0;


        Consumer<String> frase = x -> System.out.println(x);

        pre.test(4);
        frase.accept("Hoy es martes");

        Supplier<String> yeah = () -> "e";

        Function<String, Boolean> esIgualHola = str -> str.equals("hola");
        boolean resultado = esIgualHola.apply("adios");

        // Implementa un lambda que devuelva el doble de un número
        Function<Integer, Integer> doble = num -> num * 2;
        int duplicado = doble.apply(7);

        // Crea un lambda que sume dos números
        BiConsumer<Integer, Integer> suma = (num1, num2) -> System.out.println(num1+num2);
        suma.accept(5, 7);

        // Crea un lambda que devuelva true o false si un numero es par
        Predicate<Integer> esPar = num -> num % 2 == 0;
        esPar.test(7);

        // Crea un lambda que convierta una cadena a minúsculas y la devuelva.
        Function<String, String> aMinusculas = str -> str.toLowerCase();

        String enMinusculas = aMinusculas.apply("AOEIAOIE");
        System.out.println(enMinusculas);

        // Crea un lambda que compare la longitud de dos cadenas y devuelva la más larga.
        BiFunction<String, String, String> compararCadenas = (str1, str2) -> {
            if(str1.length() > str2.length()){
                return str1;
            } else{
                return str2;
            }
        };
        String cadenaLarga = compararCadenas.apply("aaaaaaaaaaaaa", "eeeeeee");
        System.out.println(cadenaLarga);

        Comparator<Integer> sort1 = (n1, n2) -> n1 - n2;
        Comparator<String> sortStr = (s1, s2) -> s1.compareTo(s2);

        // Streams
        // Collections: ArraList, LinkedList, HashMap, HashSet, TreeMap, TreeSet
        List<Integer> enteros = Arrays.asList(1,2,3,4,5,6);
        enteros.forEach(num -> System.out.println(num));

        List<Integer> newList = enteros.stream()
                .filter(num -> num > 0)
                .map(n -> n*2)
                .toList();


        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(-4,-5,6)
        );

        Library carrus = new Library("Carrus", "Plaza Madrid");

        Book harryPotter = new Book("Harry potter", "J.K.Rowling", 589);
        carrus.addBook(harryPotter);

        Book lasBrujas = new Book("Las brujas", "Roald", 152);
        carrus.addBook(lasBrujas);

        Book troll = new Book("El Libro Troll", "Anonimo", 7);
        carrus.addBook(troll);

        // Mostrar todos los libros que hay en la libería el autor
        carrus.getBooks().stream().forEach(book -> System.out.println(book.getAuthor()));

        // Mostrar por orden de author descendente, solo los libros que tengan más de 10 páginas
        carrus.getBooks().stream()
                .sorted((b1, b2) -> b2.getAuthor().compareTo(b1.getAuthor()))
                .filter(book -> book.getPages() > 10)
                .forEach(book -> System.out.println(book.getISBN()));

        Library altabix = new Library("Altabix", "Altabix");

        Book elPlanetaTesoro = new Book("El planeta del tesoro", "Not found", 800);
        altabix.addBook(elPlanetaTesoro);

        Book elPrincipito = new Book("El principito", "test", 477);
        altabix.addBook(elPrincipito);

        List<Library> libreriesELche = Arrays.asList(carrus, altabix);


        // de todas las librerias de elche, contar el numero de libros totales

        // de todas las librerias de elche, quiero los libros que tengan menos de 10 paginas, actualizarlos a 0 paginas y luego
        // quiero recoger una lista con solo el nombre de esos libros(0 páginas)


    }
}


