Este repositório apresenta a implementação do padrão de projeto Observer em um cenário de distribuição de notícias em tempo real.
O sistema simula um portal de notícias (PortalNoticias) que notifica automaticamente seus assinantes (AssinanteEmail, AssinanteSMS, AssinantePush) sempre que uma nova notícia é publicada.

A classe Noticiario atua como o sujeito (Subject), sendo responsável por manter uma lista de observadores e notificá-los sempre que houver uma atualização.
As classes que implementam a interface Assinante representam os observadores (Observers), que reagem de maneira personalizada à nova informação recebida.

Essa implementação demonstra como o padrão Observer permite a comunicação desacoplada entre objetos, promovendo flexibilidade e facilidade de manutenção em sistemas que dependem de atualizações dinâmicas.
