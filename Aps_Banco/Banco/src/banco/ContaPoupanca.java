package banco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
        this.setCredito(0);
    }

    public ContaPoupanca(String nome, double saldo, boolean status) {
        super(nome, saldo, status);
        this.setCredito(0);
    }
}
