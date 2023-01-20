package collection_works.random;

import java.util.stream.Stream;

public class DoubleColonWorks {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");
        stream.forEach(System.out::println);
    }
}
