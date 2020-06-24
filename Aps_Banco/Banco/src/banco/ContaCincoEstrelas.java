package banco;

public class ContaCincoEstrelas extends Conta{
    public ContaCincoEstrelas() {
        this.setCredito(500);
    }

    public ContaCincoEstrelas(String nome, double saldo, boolean status) {
        super(nome, saldo, status);
        this.setCredito(500);
    }
}
