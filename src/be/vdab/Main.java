package be.vdab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /*String [] groenten = new String[] {"tomaat", "sla", "ui", "prei"};
        Stream<String> stream = Arrays.stream(groenten);
        stream.forEach(groente -> System.out.println(groente));

        Arrays.stream(groenten)
                .forEach(groente -> System.out.println(groente));*/

        /*List<String> groenten = List.of("tomaat", "sla", "ui", "prei");

        groenten.stream()
                .forEach(groente -> System.out.println(groente));*/

        /*Set<Integer> heiligeGetallen = new LinkedHashSet<>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);

        heiligeGetallen.stream()
                .forEach(groente -> System.out.println(groente));*/

        /*Map<String, String> talen = new LinkedHashMap<>();
        talen.put("NL", "Nederlands");
        talen.put("FR", "Frans");

        talen.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));*/

        /*"Lambdafun".chars()
                .forEach(c ->System.out.println((char) c));*/

        /*try (Stream<String> stream = Files.lines(Path.of("/Users/joann/data/languages.txt"))) {
            stream.forEach(regel -> System.out.println(regel));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }*/

        /*try (Stream<Path> stream = Files.list(Path.of("/Users/joann/data"))) {
            stream.forEach(entry -> System.out.println(entry.getFileName()));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }*/

        /*Stream.iterate(1, vorigGetal -> vorigGetal + 2)
                .limit(10)
                .forEach(onevenGetal -> System.out.println(onevenGetal));*/

        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
        IntStream.range(1, 10)
                .forEach(System.out::println);
    }
}
