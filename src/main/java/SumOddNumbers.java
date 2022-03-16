import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i=0, sum=0;

        do {
            System.out.println("Pls Enter number: ");
            i= scanner.nextInt();
            if (i%2==0 && i%4==0){
                sum += i ;


            }

        }
        while (i%2==0);
                        System.out.println(sum);

    }
}
