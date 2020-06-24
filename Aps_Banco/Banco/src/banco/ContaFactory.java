package banco;

public class ContaFactory {
    public static Conta criarConta(int tipoConta){
        switch (tipoConta){
            case 1:
                return new ContaComum();
            case 2:
                return new ContaPoupanca();
            case 3:
                return new ContaCincoEstrelas();
            default:
                return null;
        }
    }
}
