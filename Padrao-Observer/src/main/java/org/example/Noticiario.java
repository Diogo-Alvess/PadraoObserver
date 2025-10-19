package org.example;

public interface Noticiario {
    void adicionarAssinante(Assinante assinante);
    void removerAssinante(Assinante assinante);
    void notificarAssinantes(String noticia);
}
