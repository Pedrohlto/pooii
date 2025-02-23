O Princípio da Substituição de Liskov (LSP) Objetos de uma classe derivada (subclasse) devem poder ser usados no lugar de objetos da classe base (superclasse) sem afetar o comportamento do programa.. 

Atualmente, temos a classe Funcionario para diferentes tipos de funcionários em uma empresa.
E temos as classes Desenvolvedor e Gerente extendendo dessa classe.

Podemos perceber que nem todos os métodos fazem sentido para todas as classes. 

🏆 Tarefa
Identifique o problema no código e explique por que ele viola o Princípio de Liskov.
Reescreva o código garantindo que cada classe implemente apenas os métodos que realmente precisa.
Crie uma classe Main para testar as implementações corrigidas.

Pense em outras profissões dentro da empresa, como Designer ou Suporte Técnico, e adicione classes para representar esses papéis corretamente!