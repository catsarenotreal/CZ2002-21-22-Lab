// P1 
/*
import java.util.Scanner;

public class P1{
    public static void main (String[] args){
        char ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a character: \n");
        ans = sc.next().charAt(0);
        switch(ans){
            case 'A': System.out.println("Action movie fan"); break;
            case 'a': System.out.println("Action movie fan"); break;
            case 'C': System.out.println("Comedy movie fan"); break;
            case 'c': System.out.println("Comedy movie fan"); break;
            case 'D': System.out.println("Drama movie fan"); break;
            case 'd': System.out.println("Drama movie fan"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
*/

// P2
/*
import java.util.Scanner;

public class P2{
    public static void main (String[] args){
        int merit; double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter merit point: ");
        merit = sc.nextInt();
        System.out.println("Please enter salary: ");
        salary = sc.nextDouble();
        if (salary >= 500 && salary <= 599){
            System.out.println("Grade C");
        }
        else if (salary >= 600 && salary <= 649 && merit < 10){
            System.out.println("Grade C");
        }
        else if (salary >= 600 && salary <= 649 && merit >= 10){
            System.out.println("Grade B");
        }
        else if (salary >= 650 && salary <= 699){
            System.out.println("Grade B");
        }
        else if (salary >= 700 && salary <= 799){
            System.out.println("Grade B");
        }
        else if (salary >= 700 && salary <= 799 && merit >= 20){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Grade A");
        }
    }
}
*/

// P3 
/*
import java.util.Scanner;

public class P3{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int starting, ending, inc;
        System.out.println("Starting: ");
        starting = sc.nextInt();
        System.out.println("Ending: ");
        ending = sc.nextInt();
        System.out.println("Increment: ");
        inc = sc.nextInt();

        if (starting >= ending) System.out.print("Error");

        System.out.println("for-loop:");
        System.out.println("US$          SG$");
        System.out.println("----------------");
        for (int i = starting; i <= ending; i+=inc){
            System.out.printf("%-12d%.2f\n", i, i*1.82);
        }

        System.out.println("while:");
        System.out.println("US$          SG$");
        System.out.println("----------------");
        int i = starting; int e = ending;
        while (true){
            System.out.printf("%-12d%.2f\n", i, i*1.82);
            i += inc;
            e -= inc;
            if (e < 0) break;
        }

        System.out.println("while:");
        System.out.println("US$          SG$");
        System.out.println("----------------");
        i = starting;
        do{
            System.out.printf("%-12d%.2f\n", i, i*1.82);
            i += inc;

        }
        while(i <= ending);

    }
}
*/

// P4
/*
import java.util.Scanner;

public class P4{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Height: ");
        height = sc.nextInt();
        if (height <= 0) System.out.print("Error");
        for (int i = 1; i <= height; i++){
            for (int j = i; j > 0 ; j--){
                if (j % 2 == 0){
                    System.out.print("BB");
                }
                if (j % 2 == 1){
                    System.out.print("AA");
                }
                
            }
            System.out.print("\n");
        }
    }
}
*/