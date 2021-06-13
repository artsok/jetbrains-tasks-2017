package io.artsok.tasks;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Последовательность натуральных чисел задаётся следующими правилами:
 * <p>
 * n → n/2, если n чётно;
 * n → 3n + 1, если n нечётно.
 * <p>
 * Используя их и выбирая 13 в качестве первого члена, получаем последовательность:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * <p>
 * Видно, что эта последовательность конечна и содержит ровно 10 членов. Хотя это до сих пор и не доказано (см. гипотеза Коллатца), предполагается, что, вне зависимости от выбора первого члена, все подобные последовательности конечны и последним своим членом имеют единицу.
 * <p>
 * Если потребовать, чтобы первый член последовательности был строго меньше 1000000, то при каком выборе первого члена последовательность будет иметь наибольшую длину? число 837799, где длинга 525
 * <p>
 * Примечание: ограничение распространяется только на первый член; значения последующих членов могут превышать один миллион.
 */

public class Task5 {

    public Map.Entry<Integer, Long> run() {
        var collection = new HashMap<Integer, Long>();
        for (var i = 0; i <= 1000000; i++) {
            if (i % 2 == 1) { // The sequence will be the longest only with odd numbers
                collection.put(i, getSequence(i));
            }
        }
        return collection.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new RuntimeException("Can't determine max number"));
    }

    private long getSequence(int value) {
        var a = BigInteger.valueOf(value);

        if (a.compareTo(BigInteger.ZERO) == 0) {
            return 0;
        }
        long sequence = 0;

        for (; ; ) {
            if (a.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) == 0) {
                a = a.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            } else {
                a = a.divide(BigInteger.valueOf(2));
            }
            sequence += 1;
            if (a.compareTo(BigInteger.ONE) == 0) {
                sequence += 1;
                break;
            }
        }
        return sequence;
    }
}
