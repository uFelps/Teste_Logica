import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String caracteres = sc.nextLine();


        String fraseInvertida = "";

        for(int i = caracteres.length() - 1; i >= 0; i--){
            fraseInvertida += caracteres.charAt(i);
        }
        
        System.out.println(fraseInvertida);
    }
}
