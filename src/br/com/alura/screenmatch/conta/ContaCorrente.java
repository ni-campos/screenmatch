package br.com.alura.screenmatch.conta;

public class ContaCorrente extends ContaBancaria {
    private  double tarifaMensal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa Mensal: R$ " + tarifaMensal + " cobrada. Saldo atual: R$" + saldo);
    }
}
