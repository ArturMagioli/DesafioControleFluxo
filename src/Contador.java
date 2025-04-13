
import java.util.Scanner;
import exceptions.ParametrosValidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosValidosException e) {

        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosValidosException {
        
    }
}
