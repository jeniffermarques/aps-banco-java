package banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja abrir uma conta?");
        System.out.print("Digite 1 para Sim e 2 para Não: ");
        int abrir = scanner.nextInt();

        if(abrir == 2) {
            System.out.println("Lamentamos por não criar sua conta!");
            return;
        } else if (abrir != 1) {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Tipos de conta:");
        System.out.println("\t1 - Conta Comum.");
        System.out.println("\t2 - Conta Poupança.");
        System.out.println("\t3 - Conta 5 Estrelas.");

        System.out.print("Qual tipo de conta deseja abrir? ");
        int tipoConta = scanner.nextInt();

        Conta conta = ContaFactory.criarConta(tipoConta);

        if(conta == null) {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        conta.abrirConta();

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        conta.setNome(nome);

        System.out.println("Conta criada!");

        conta.extrato();

        boolean encerrar = false;

        while(!encerrar) {
            System.out.println("Opções: ");
            System.out.println("\t1 - Ver extrato.");
            System.out.println("\t2 - Depositar.");
            System.out.println("\t3 - Sacar.");
            System.out.println("\t4 - Fechar conta.");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    conta.extrato();
                    break;
                case 2:
                    System.out.print("Qual valor deseja depositar? R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Qual valor deseja sacar? R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.println("Tem certeza?");
                    System.out.print("Digite 1 para Sim e 2 para Não: ");
                    int confirmacao = scanner.nextInt();
                    if(confirmacao == 1){
                        if(conta.fecharConta()) {
                            System.out.println("Conta fechada!");
                            encerrar = true;
                        }
                        break;
                    }
                    System.out.println("Conta não fechada!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }


    }        
}
    

