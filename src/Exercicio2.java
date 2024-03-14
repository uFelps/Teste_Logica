import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        int num = sc.nextInt();

        if(verificarNumero(num)){
            System.out.println(num + " faz parte da sequência de Fibonacci");
        }

        else {
            System.out.println(num + " não faz parte da sequência de Fibonacci");
        }
    }

    private static boolean verificarNumero(int num){

        long[] sequencia = new long[30];
        sequencia[0] = 0;
        sequencia[1] = 1;

        for(int i = 2; i < sequencia.length; i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];

            if(sequencia[i] == num){
                return true;
            }
        }

        System.out.println(Arrays.toString(sequencia));
       return false;
    }
}