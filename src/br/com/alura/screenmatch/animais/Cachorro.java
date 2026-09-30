package br.com.alura.screenmatch.animais;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Cachorro faz: Au Au");
    }

    public void abanarRabo(){
        System.out.println("E Abana o rabo");
    }
}
