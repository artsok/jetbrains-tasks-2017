package io.artsok.tasks;

import java.math.BigInteger;

/**
 * Факториал 10 равен
 * <p>
 * 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * <p>
 * а сумма цифр десятичной записи числа равна
 * <p>
 * 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Найдите сумму цифр десятичной записи числа 100! = 648
 */
public class Task3 {

    public BigInteger run() {
        var value = getFactorial(100).toString();
        BigInteger result = BigInteger.ZERO;
        for (var i = 0; i < value.length(); i++) {
            result = result.add(BigInteger.valueOf(Character.digit(value.charAt(i), 10)));
        }
        return result;
    }

    private BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (var i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
