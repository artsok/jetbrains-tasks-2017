package io.artsok.tasks;

import java.math.BigInteger;

/**
 * Сумма последовательности
 * <p>
 * 11 + 22 + 33 + ... + 10^10
 * <p>
 * равна 10405071317. Найдите последние 10 цифр суммы последовательности
 * <p>
 * 11 + 22 + 33 + ... + 1000^1000
 */
public class Task1 {

    public String run() {
        var k = 1000;
        var result = BigInteger.ZERO;
        for (var i = 1; i <= k; i++) {
            result = result.add(BigInteger.valueOf((long) Math.pow(i, i)));
        }
        return result.toString().substring(result.toString().length() - 10);
    }
}
