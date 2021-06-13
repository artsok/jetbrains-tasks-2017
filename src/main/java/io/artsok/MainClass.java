package io.artsok;


import io.artsok.tasks.*;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Answer for task [1]. Find the last 10 digits of the sum of the sequence 1^1 + 2^2 + 3^3 + ... + 1000^1000?: [" + new Task1().run() + "].");
        System.out.println("Answer for task [2]. What is the index of the first member of the Fibonacci series, which has 1000 digits in decimal notation?: [" + new Task2().run() + "].");
        System.out.println("Answer for task [3]. Find the sum of the digits in the decimal notation of the number 100!?: [" + new Task3().run() + "].");
        System.out.println("Answer for task [4]. What is the sum of the digits in the decimal notation of 2 ^ 1000?: [" + new Task4().run() + "].");
        System.out.println("Answer for task [5]. Number and it max sequence length: [" + new Task5().run() + "].");
    }
}
