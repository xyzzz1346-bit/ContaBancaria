
public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Fiama Brenda", 500);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        System.out.println("Limite: R$ " + conta.getLimite());

        System.out.println("\n--- TESTE DE DEPÓSITO ---");

        conta.depositar(1000);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- TESTE DE SAQUE ---");

        conta.sacar(300);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- TESTE DE USO DO LIMITE ---");

        conta.sacar(1000);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- TESTE DE SAQUE INSUFICIENTE ---");

        conta.sacar(500);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- TESTE DE DEPÓSITO INVÁLIDO ---");

        conta.depositar(-100);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
