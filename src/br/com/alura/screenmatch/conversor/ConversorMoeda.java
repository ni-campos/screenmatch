package br.com.alura.screenmatch.conversor;

public class ConversorMoeda implements ConversorFinanceiro {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é R$" + valorReal);
    }
}
