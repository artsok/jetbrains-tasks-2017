
### Intro
I found [tasks] from that GitHub page and had the interest to resolve while stayed home with COVID-19.

I know that it's not the best solutions in my code :) But you can help me to improve it

### Tasks
1. Find the last 10 digits of the sum of the sequence 1^1 + 2^2 + 3^3 + ... + 1000^1000?: 
2. What is the index of the first member of the Fibonacci series, which has 1000 digits in decimal notation?: 
3. Find the sum of the digits in the decimal notation of the number 100!?:
4. What is the sum of the digits in the decimal notation of 2 ^ 1000?:
5. Find the number and it max sequence length 

### Run app
Run gradle to get the answer for the tasks 1-5.
```
gradle run
```

### Commentaries
1. In task 2 we can use the formula to find index, but standard digit numbers (int, long, double) have limits, that why I used BigDecimal. 
```
double n = 144.0;
int a = (int) Math.round(Math.log(n * Math.sqrt(5) + 0.5) / Math.log((1 + Math.sqrt(5))/2));
```

2. Task #5 could be improved by using storage for already found sequences.

[tasks]: https://github.com/unix-junkie/teamcity-autotools-plugin/issues/1
 