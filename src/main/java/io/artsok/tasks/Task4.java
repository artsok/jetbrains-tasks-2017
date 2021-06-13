package io.artsok.tasks;

import java.math.BigInteger;


/**
 * 2^15 = 32768, а сумма цифр числа равна
 * <p>
 * 3 + 2 + 7 + 6 + 8 = 26.
 * <p>
 * Какова сумма цифр десятичной записи числа 2^1000? = 1366
 */
public class Task4 {

    public BigInteger run() {
        //n = это степень в которую возводим.
        var n = 1000;
        var a = BigInteger.ONE;
        var bigInteger = a.shiftLeft(n); //The behavior like  1 << 15; //2^15
        BigInteger result = BigInteger.ZERO;
        var value = bigInteger.toString();
        for (int i = 0; i < value.length(); i++) {
            result = result.add(BigInteger.valueOf(Character.digit(value.charAt(i), 10)));
        }
        return result;
    }
}
