
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {



    String [] tarefas = {"Limpar a casa",
                         "Programar",
                         "Fazer seqisokk",
                         "Cozinhar",
                         "Tomar banho"};
    Scanner sc = new Scanner(System.in);
    int opcao = 0;

    while (opcao != 9){
        System.out.println("Menu Unipar");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Contar");
        System.out.println("6 - Escolher tarefa");
        System.out.println("9 - SAIR");
        opcao = sc.nextInt();


    if (opcao == 1) {

        System.out.println("Informe um valor : ");
        int valor1 = sc.nextInt();

        System.out.println("Informe outro valor : ");
        int valor2 = sc.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("O resultado é :" + resultado);
    } else if (opcao == 5) {

        System.out.println("Até quando você deseja contar ? ");
        int contar = sc.nextInt();

        for(int o = 0; o <= contar; o++){
            System.out.println(o);
        }


    }else if (opcao == 6){

        int valorRandom = (int)(Math.random() * tarefas.length);
        System.out.println( tarefas[valorRandom]);
    }


    }

        System.out.println("vc saiu :)");




    }
}
