package be.vdab;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {
    /*public static Set<String> gesorteerdeGroenten() {
        return Stream.of("sla", "wortel", "kool", "biet")
                *//*.sorted()
                .toList();*//*
                .collect(Collectors.toSet());
    }*/

    public static void main(String[] args) {
        var groentenPerLengte =
                Stream.of("sla", "kool", "wortel", "biet")
                        .collect(Collectors.groupingBy(groente -> groente.length()));

        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.print(entry.getKey() + " ");
                    entry.getValue().stream()
                            .forEach(groente -> System.out.print(groente + " "));
                    System.out.println();
                });

        /*System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .collect(Collectors.joining(", ")));*/
    }
}
