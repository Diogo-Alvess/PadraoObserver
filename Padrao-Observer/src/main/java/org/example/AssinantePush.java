package org.example;

public class AssinantePush implements Assinante {

    private String nome;

    public AssinantePush(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("[PUSH] " + nome + " recebeu: " + noticia);
    }
}