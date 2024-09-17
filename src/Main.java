import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int somaTotal = 0;

        while (valor != 99) {
            //System.out.println(valor);

            System.out.println("Informe o valor:");
            System.out.println("Informe 99 para sair");

            valor = sc.nextInt();

            somaTotal += valor;

        }
        System.out.println("O total é :"+ somaTotal);

    }
}
