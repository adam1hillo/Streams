package be.vdab;

import java.util.stream.Stream;

public class MainMatch {
    public static void main(String[] args) {
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                    .allMatch(groente -> groente.length() == 4));
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                    .anyMatch(groente -> groente.length() == 4));


    }
}
