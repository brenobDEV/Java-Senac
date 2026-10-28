import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma opção: ");
            String opcao = input.nextLine();
            if (opcao.equals("sair")){
                break;
            }
        }
    }}
