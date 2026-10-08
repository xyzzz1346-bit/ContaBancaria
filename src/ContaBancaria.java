```java
public class ContaBancaria {

    private String titular;
    private double saldo;
    private double limite;

    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.saldo = 0;
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser maior que 0.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que 0.");
        } else if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimite() {
        return limite;
    }
}
```
