
public class Main {

    public static void main(String[] args) {

        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        Conta cc = new ContaCorrente(daniel);
        Conta cp = new ContaPoupanca(daniel);

        cc.depositar(100);
        cp.depositar(200);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
