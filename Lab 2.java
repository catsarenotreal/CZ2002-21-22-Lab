import java.util.Scanner;

public class Lab2p1{
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Perform the following methods: ");
            System.out.println("1: Multiplication test ");
            System.out.println("2: Quotient using division by subtraction ");
            System.out.println("3: Remainder using division by subtraction ");
            System.out.println("4: Count the number of digits ");
            System.out.println("5: Position of a digit ");
            System.out.println("6: Extract all odd digits ");
            System.out.println("7: Quit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                mulTest();
                    break;
                case 2:
                    int m, n;
                    System.out.print("m = ");
                    m = sc.nextInt();
                    System.out.print("n = ");
                    n = sc.nextInt();
                    System.out.println(m + "/" + n + " = " + divide(m,n));
                    break;
                case 3:
                    System.out.print("m = ");
                    m = sc.nextInt();
                    System.out.print("n = ");
                    n = sc.nextInt();
                    System.out.println(m + "%" + n + " = " + modulus(m,n));
                    break;
                case 4:
                    int k;
                    System.out.print("n: ");
                    m = sc.nextInt();
                    k = countDigits(m);
                    if (k == -1) System.out.println("Error!");
                    else System.out.println("Count = " + k);
                    break;
                case 5:
                    System.out.print("n: ");
                    m = sc.nextInt();
                    System.out.print("digit: ");
                    n = sc.nextInt();
                    System.out.println("Position = " + position(m, n));
                    break;
                case 6:
                    long e;
                    System.out.print("n: ");
                    e = sc.nextLong();
                    long j = extractOddDigits(e);
                    if (j == -11) System.out.println("Error!");
                    else System.out.println("OddDigits = " + j);
                    break;
                case 7:
                    System.out.println("Program terminating......");
                    break;
            }
        } while (choice < 7);
    }

    public static void mulTest(){
        int ans; int x1, x2; int actual; int counter = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++){
            x1 = (int) (10 * Math.random());
            x2 = (int) (10 * Math.random());
            System.out.println("How much is " + x1 + " times " + x2 + "?");
            ans = sc.nextInt();
            actual = x1 * x2;
            if (ans == actual){
                counter++;
            }
        }
        System.out.println(counter + " answers out of 5 are correct.");
    }

    public static int divide(int m, int n){
        int counter = 0;
        while (m > 0){
            m -= n;
            if (m >= 0) counter++;
        }
        return counter;
    }

    public static int modulus(int m, int n){
        do{
            m -= n;
        } while (m > 0);
        return m + n;
    }

    public static int countDigits(int n){
        int counter = 0;
        if (n < 0) return -1;
        while (n > 0){
            n = n / 10;
            counter++;
        }
        return counter;
    }

    public static int position(int n, int digit){
        int num; int counter = 0;
        while (n > 0){
            num = n % 10;
            n /= 10;
            counter++;
            if (num == digit){
                return counter;
            }
        }
        return -1;
    }

    public static long extractOddDigits(long n){
        long counter = 0; long number = 0;
        if (n < 0) return -11;
        while (n > 0){
            if ((n % 10) % 2 == 0){
                n = n / 10; 
                continue;
            }
            number += (n % 10) * Math.pow(10, counter);
            counter++;
            n = n / 10;
        }
        if (number == 0) return -1;
        return number;
    }
}
