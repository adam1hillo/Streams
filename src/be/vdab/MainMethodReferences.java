package be.vdab;

import java.util.stream.Stream;

public class MainMethodReferences {

    private static String omgekeerd(StringBuilder builder) {
        return builder.reverse().toString();
    }

    public static void main(String[] args) {

        Stream.of("repeL", "LepeL")
                .map(StringBuilder::new)
                .map(MainMethodReferences::omgekeerd)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
