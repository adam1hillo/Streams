package be.vdab;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainFlatMap {
    public static void main(String[] args) {

        /*Stream.of(Stream.of("Joe", "Jack"), Stream.of("William", "Averell"))
                .flatMap(stream -> stream)
                .forEach(voornaam -> System.out.println(voornaam));*/

        var stream = Stream.of("The lord of the rings", "The hobbit");

        stream
                .map(titel -> titel.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .map(woord -> woord.toLowerCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
