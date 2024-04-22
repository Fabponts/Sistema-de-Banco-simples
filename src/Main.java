import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura =new Scanner(System.in);

            System.out.println("************************************");
            System.out.println("Dados do Usuario:");
            System.out.println(" Bem vindo ao Banco Fabpont! Digite seu nome completo:");
            String nome = leitura.nextLine();
            System.out.println(nome);


            String tipoConta = "Corrente";
            System.out.println("Tipo de conta: "+ tipoConta);

            double saldo = 2500.00;
            System.out.println("Saldo disponivel: R$ " +saldo);
            System.out.println("************************************");

            int opcao = 0;
        String menu = """
                **Digite sua Opçao**
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4-  Sair
                """;
            Scanner leitor = new Scanner(System.in);
            while(opcao!=4){
                System.out.println(menu);
                opcao = leitor.nextInt();

                if (opcao == 1){
                    System.out.println("Seu saldo atualizado é: " + saldo );
                }else if (opcao == 2){
                    System.out.println("Valor desejado para transferencia:");
                    double valor = leitura.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo indisponivel");
                    }else {
                        System.out.println("Transferencia efetuada com sucesso:)");
                        saldo -= valor;
                        System.out.println("Novo saldo:" + saldo);
                    }
                } else if (opcao ==3) {
                    System.out.println("Valor recebido");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo: " + saldo);
                }else if (opcao==4){
                    System.out.println("Obrigado e até breve:");
                }
            }
    }
}