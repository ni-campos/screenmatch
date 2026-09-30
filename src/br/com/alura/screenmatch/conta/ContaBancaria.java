package br.com.alura.screenmatch.conta;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$"+valor + " realizado com sucesso. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor){
        if (saldo <= valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        }else {
            System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}
