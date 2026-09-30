package br.com.alura.screenmatch.geometrico;

import br.com.alura.screenmatch.conversor.ConversorFinanceiro;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Área da sala retangular: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro da sala retangular: " + perimetro);
    }
}
