package eulertools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author forest
 */
public class PrimeNumberGenerator {
    
    private static List<Integer> primes = new ArrayList<>();
    private static int num = 1;
    
    PrimeNumberGenerator() {
        primes.add(2);
        System.out.println("1:\t\t2");
        int check = 3;
        while (num <= 640000) {
            isPrime(check);
            check += 2;
        }
    }
    
    private static void isPrime(int n) {
        for (int i = 0; primes.get(i) <= n / primes.get(i); i++) {
            if (n % primes.get(i) == 0) {
                return;     //return without adding new prime if not divisible by other previous primes
            }
        }
        primes.add(n);
        num++;
        System.out.println(num + ":\t\t" + n);
    }
}
