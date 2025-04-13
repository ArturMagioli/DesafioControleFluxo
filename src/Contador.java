
import java.util.Scanner;
import exceptions.ParametrosValidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosValidosException e) {
            System.out.println("Error: O primeiro número é maior que o segundo!");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosValidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosValidosException();
        
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
