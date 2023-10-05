import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] pessoas = new String[15];
        String pessoa;

        for (int i = 1; i < 15; i++) {
            System.out.println("Digite o " + i +"° nome: ");
            pessoa = entrada.nextLine();
            pessoas[i] = pessoa;

        }
        System.out.println(Arrays.toString(pessoas));
    }
}
