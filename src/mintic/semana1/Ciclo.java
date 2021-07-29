package mintic.semana1;
import java.util.Scanner;

public class Ciclo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        long acum = 1;
        long num = input.nextInt();

        for(long i = 1; i <= num;i++){
            acum = acum * i;
        }
    System.out.println(acum);

    }
}
