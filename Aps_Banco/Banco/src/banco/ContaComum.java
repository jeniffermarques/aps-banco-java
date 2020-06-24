package banco;

public class ContaComum extends Conta {
    public ContaComum() {
        this.setCredito(100);
    }

    public ContaComum(String nome, double saldo, boolean status) {
        super(nome, saldo, status);
        this.setCredito(100);
    }
}
