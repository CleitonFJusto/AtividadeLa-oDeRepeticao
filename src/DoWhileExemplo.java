import java.util.Scanner;

public class DoWhileExemplo {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner tantoFaz = new Scanner(System.in);
        do{
            System.out.println(" ** Escolha **");
            System.out.println("1 - Inserir");
            System.out.println("2 - Excluir");
            System.out.println("3 - Alterar");
            System.out.println("0 - Sair");
            opcao = tantoFaz.nextInt();
        }while(opcao != 0);


    }
}
