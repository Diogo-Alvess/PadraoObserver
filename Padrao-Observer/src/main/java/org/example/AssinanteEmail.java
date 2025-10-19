package org.example;

public class AssinanteEmail implements Assinante {

    private String nome;

    public AssinanteEmail(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("[EMAIL] " + nome + " recebeu: " + noticia);
    }
}
