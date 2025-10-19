package org.example;

import java.util.ArrayList;
import java.util.List;

public class PortalNoticias implements Noticiario {

    private List<Assinante> assinantes = new ArrayList<>();

    @Override
    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    @Override
    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    @Override
    public void notificarAssinantes(String noticia) {
        for (Assinante a : assinantes) {
            a.atualizar(noticia);
        }
    }

    public void publicarNoticia(String noticia) {
        System.out.println("Publicando: " + noticia);
        notificarAssinantes(noticia);
    }
}
