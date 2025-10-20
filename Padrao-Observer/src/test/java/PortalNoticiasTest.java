package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortalNoticiasTest {

    @Test
    void deveNotificarAssinantes() {
        PortalNoticias portal = new PortalNoticias();

        Assinante maria = new AssinanteEmail("Maria");
        Assinante joao = new AssinanteSMS("João");
        Assinante carla = new AssinantePush("Carla");

        portal.adicionarAssinante(maria);
        portal.adicionarAssinante(joao);
        portal.adicionarAssinante(carla);

        portal.publicarNoticia("Novo edital de bolsas publicado!");
    }

    @Test
    void deveAdicionarERemoverAssinantes() {
        PortalNoticias portal = new PortalNoticias();
        Assinante pedro = new AssinanteEmail("Pedro");

        portal.adicionarAssinante(pedro);
        portal.removerAssinante(pedro);

        // Nenhum erro deve ocorrer ao remover e publicar
        portal.publicarNoticia("Nova notícia sem assinantes!");
        assertTrue(true);
    }
}
