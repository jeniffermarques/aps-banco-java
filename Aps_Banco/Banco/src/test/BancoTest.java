package test;

import banco.Conta;
import banco.ContaCincoEstrelas;
import banco.ContaComum;
import banco.ContaPoupanca;

public class BancoTest {
    public static void main(String[] args) {
        System.out.println("*** Conta Comum ***");
        Conta comum = new ContaComum("Jeniffer", 100, true);
        comum.sacar(130);
        comum.depositar(10);
        comum.extrato();
        System.out.println("******\n");

        System.out.println("*** Conta Poupança ***");
        Conta poupanca = new ContaPoupanca("Marcio", 50, true);
        poupanca.sacar(20);
        poupanca.depositar(5);
        poupanca.extrato();
        System.out.println("******\n");

        System.out.println("*** Conta Cinco Estrelas ***");
        Conta cincoEstrelas = new ContaCincoEstrelas("Pamela", 1000, true);
        cincoEstrelas.sacar(1600);
        cincoEstrelas.sacar(1500);
        cincoEstrelas.depositar(500);
        cincoEstrelas.fecharConta();
        cincoEstrelas.extrato();
        System.out.println("******\n");
    }
}
