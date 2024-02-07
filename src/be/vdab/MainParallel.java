package be.vdab;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.Stream;

public class MainParallel {

    private static void zonderParallel(long aantalWaarden) {
        Random random = new Random();
        var voor = System.nanoTime();

        Stream.generate(() -> BigDecimal.valueOf(random.nextDouble()))
                .limit(aantalWaarden)
                .filter(getal -> getal.remainder(BigDecimal.valueOf(2))
                        .compareTo(BigDecimal.ZERO) == 0)
                .max((vorigGrootse, getal) -> vorigGrootse.compareTo(getal));

        System.out.println(String.format("%, 16d:%,16d zonder parallel", aantalWaarden, System.nanoTime()-voor));
    }

    private static void metParallel(long aantalWaarden) {
        Random random = new Random();
        var voor = System.nanoTime();

        Stream.generate(() -> BigDecimal.valueOf(random.nextDouble()))
                .parallel()
                .limit(aantalWaarden)
                .filter(getal -> getal.remainder(BigDecimal.valueOf(2))
                        .compareTo(BigDecimal.ZERO) == 0)
                .max((vorigGrootse, getal) -> vorigGrootse.compareTo(getal));

        System.out.println(String.format("%, 16d:%,16d met parallel", aantalWaarden, System.nanoTime()-voor));
    }

    public static void main(String[] args) {
        Stream.of(10, 100, 1000, 10000, 100000, 1000000, 10000000)
                .forEach(aantalWaarden -> {
                    zonderParallel(aantalWaarden);
                    metParallel(aantalWaarden);
                });
        System.out.println("the end");
    }
}
