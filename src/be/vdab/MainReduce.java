package be.vdab;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class MainReduce {
    public static void main(String[] args) {

        /*System.out.println(
                Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                        .reduce(BigDecimal.ZERO, (vorigeSom, getal) -> vorigeSom.add(getal))
        );*/

        Stream.of(BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .reduce((getal1, getal2) -> getal1.add(getal2))
                .ifPresent(som -> System.out.println(som));
    }
}
