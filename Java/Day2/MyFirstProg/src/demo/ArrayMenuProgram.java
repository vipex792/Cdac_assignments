package demo;

import java.util.Scanner;

public class ArrayMenuProgram {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int[] getPrimes(int[] arr, boolean asc) {
        // Count primes first
        int count = 0;
        for (int val : arr) {
            if (isPrime(val)) count++;
        }
        int[] primes = new int[count];
        int index = 0;
        for (int val : arr) {
            if (isPrime(val)) {
                // Avoid duplicates
                boolean duplicate = false;
                for (int j = 0; j < index; j++) {
                    if (primes[j] == val) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    primes[index++] = val;
                }
            }
        }
        // Resize array if duplicates removed
        if (index < count) {
            int[] temp = new int[index];
            for (int i = 0; i < index; i++) {
                temp[i] = primes[i];
            }
            primes = temp;
        }
        // Sort primes
        for (int i = 0; i < primes.length - 1; i++) {
            for (int j = i + 1; j < primes.length; j++) {
                if ((asc && primes[i] > primes[j]) || (!asc && primes[i] < primes[j])) {
                    int t = primes[i];
                    primes[i] = primes[j];
                    primes[j] = t;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("val[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n1) Primes 2) Odd digits sum 3) Factorials <7 4) Nth max prime 5) Nth min prime 6) Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Primes: ");
                for (int val : arr) {
                    if (isPrime(val)) {
                        System.out.print(val + " ");
                    }
                }
                System.out.println();
            } else if (ch == 2) {
                System.out.println("Odd numbers and sum of digits:");
                for (int val : arr) {
                    if (val % 2 != 0) {
                        System.out.println(val + " -> sum digits = " + sumDigits(val));
                    }
                }
            } else if (ch == 3) {
                System.out.println("Factorials of numbers less than 7:");
                for (int val : arr) {
                    if (val >= 0 && val < 7) {
                        System.out.println(val + "! = " + fact(val));
                    }
                }
            } else if (ch == 4) {
                System.out.print("Enter n: ");
                int k = sc.nextInt();
                int[] primesDesc = getPrimes(arr, false);
                if (k <= primesDesc.length) {
                    System.out.println(k + "th max prime = " + primesDesc[k - 1]);
                } else {
                    System.out.println("Not enough primes");
                }
            } else if (ch == 5) {
                System.out.print("Enter n: ");
                int k = sc.nextInt();
                int[] primesAsc = getPrimes(arr, true);
                if (k <= primesAsc.length) {
                    System.out.println(k + "th min prime = " + primesAsc[k - 1]);
                } else {
                    System.out.println("Not enough primes");
                }
            } else if (ch == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
