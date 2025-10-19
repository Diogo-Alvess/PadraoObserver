package org.example;

public class AssinanteSMS implements Assinante {

    private String nome;

    public AssinanteSMS(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("[SMS] " + nome + " recebeu: " + noticia);
    }
}
