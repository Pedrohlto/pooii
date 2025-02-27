📌 Exercício: Criando um Sistema de Pedidos Aplicando o Princípio da Inversão de Dependência (DIP)

Você foi contratado para desenvolver um sistema de pedidos para um e-commerce. 
Esse sistema permitirá que um cliente realize um pedido, escolhendo um método de pagamento e um método de notificação para receber a confirmação do pedido.

O sistema precisa ser flexível, permitindo a adição de novos métodos de pagamento e novos serviços de notificação sem modificar a lógica central do pedido. 
Para isso, você deve seguir o Princípio da Inversão de Dependência (DIP), garantindo que a classe de pedidos não dependa diretamente de implementações concretas, mas sim de abstrações.

- Criar a classe ServicoPedido para processar pedidos:
A classe ServicoPedido deve:
Receber um MetodoPagamento e um ServicoNotificacao via injeção de dependência.
Processa o pagamento pelo método escolhido.
Envia uma notificação ao cliente informando que o pedido foi realizado com sucesso.