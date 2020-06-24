package banco;

import java.util.Random;

public abstract class Conta {
    private String nome;
    private int numero;
    private double saldo;
    private double credito;
    private boolean status;

    public Conta() {
        this.gerarNumeroConta();
    }

    public Conta(String nome, double saldo, boolean status) {
        this.nome = nome;
        this.saldo = saldo;
        this.status = status;

        this.gerarNumeroConta();
    }

    public void abrirConta(){
        this.setSaldo(0);
        this.setStatus(true);
    }

    public boolean fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Impossível fechar conta, saldo positivo");
            } else if (this.getSaldo() < 0) {
                System.out.println("Impossível fechar conta, saldo negativo");
            } else {
                this.setStatus(false);
                System.out.println("Conta de " + this.getNome() + " fechada com sucesso.");
                return true;
            }
        } else {
            System.out.println("Conta fechada.");
        }

        return false;
    }

    public void depositar(double valor) {
        if (this.getStatus()) {
            if (valor > 0) {
                this.setSaldo(this.getSaldo() + valor);
                System.out.println("Depósito realizado na conta de " + this.getNome() + " no valor de R$: " + valor + ". Saldo atual R$ " + this.getSaldo());
            } else {
                System.out.println("Por favor digite um valor válido.");
            }
        } else {
            System.out.println("Impossível depositar, conta fechada.");
        }
    }

    public void sacar(double valor) {
        if (this.getStatus()) {
            if (valor > 0) {
                if (this.getSaldo() >= valor) {
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Saque realizado na conta de " + this.getNome() + " no valor de R$: " + valor + ". Saldo atual R$ " + this.getSaldo());
                } else if ((this.getSaldo() + this.getCredito()) >= valor) {
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Saque realizado na conta de " + this.getNome() + " no valor de R$: " + valor + ". Saldo atual R$ " + this.getSaldo());
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            } else {
                System.out.println("Por Favor digite um valor válido para saque.");
            }
        } else {
            System.out.println("Impossivel sacar conta fechada");
        }
    }

    public void extrato() {
        System.out.println("-------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Crédito: R$ " + this.getCredito());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatusTexto());
        System.out.println("-------------------------------");
    }

    private void gerarNumeroConta(){
        int menor = 1000;
        int maior = 9999;
        this.setNumero(new Random().nextInt(maior - menor) + menor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return this.credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusTexto() {
        if(status){
            return "Aberta";
        } else {
            return "Fechada";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
