package be.vdab;

import java.math.BigDecimal;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStatistieken {

    public static void main(String[] args) {

        /*System.out.println(Stream.of("sla", "wortel", "kool", "biet").count());*/

        /*IntStream stream = IntStream.of(1, 2, 4, 7);
        System.out.println(stream.sum());*/

        /*IntStream stream = IntStream.of(1, 2, 4, 7);
        stream.min().ifPresent(kleinste -> System.out.println(kleinste));
        IntStream stream2 = IntStream.of(1, 2, 4, 7);
        stream2.max().ifPresent(kleinste -> System.out.println(kleinste));
        IntStream stream3 = IntStream.of(1, 2, 4, 7);
        stream3.average().ifPresent(System.out::println);*/

        /*System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .mapToInt(groente -> groente.length())
                        .sum()
        );*/

        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .min((getal1, getal2) -> getal1.compareTo(getal2))
                .ifPresent(kleinste -> System.out.println(kleinste));
    }
}
