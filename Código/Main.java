public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Pedro");

        conta.depositar(1000);

        conta.sacar(250);

        conta.exibirDados();
    }
}
