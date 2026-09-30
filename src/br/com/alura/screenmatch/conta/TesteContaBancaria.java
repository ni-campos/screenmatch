package br.com.alura.screenmatch.conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1500);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
