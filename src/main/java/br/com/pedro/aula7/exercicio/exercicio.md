O Princípio da Segregação de Interfaces (ISP) afirma que uma classe não deve ser forçada a implementar métodos que não utiliza. 
Para evitar isso, devemos criar interfaces menores e mais específicas em vez de uma única interface grande.

Atualmente, temos a interface Funcionario para diferentes tipos de funcionários em uma empresa.
E temos as classes Desenvolvedor e Gerente implementando essa interface.

Podemos perceber que nem todos os métodos fazem sentido para todas as classes. 

🏆 Tarefa
Identifique o problema no código e explique por que ele viola o Princípio da Segregação de Interfaces.
Reescreva o código garantindo que cada classe implemente apenas os métodos que realmente precisa.
Crie uma classe Main para testar as implementações corrigidas.

Pense em outras profissões dentro da empresa, como Designer ou Suporte Técnico, e adicione mais interfaces e classes para representar esses papéis corretamente!