Exercício: Lista Genérica com Atributos
Enunciado: Implemente a classe genérica MinhaLista<T> utilizando List<T> para armazenar elementos. Além da lista de itens, a classe deve ter um nome e uma data limite.

Atributos:
String nome: Nome da lista.
LocalDate dataLimite: Data limite da lista.
List<T> elementos: Lista para armazenar os elementos.

Métodos:
adicionar(T elemento) → Adiciona um elemento à lista.
remover(T elemento) → Remove um elemento da lista.
buscar(T elemento) → Retorna se o elemento está na lista.
tamanho() → Retorna o número de elementos.
limpar() → Remove todos os elementos.
exibirLista() → Mostra o nome, a data limite e os elementos.
estaExpirada() → Retorna se a lista expirou.
renomear(String novoNome) → Altera o nome da lista.
estenderDataLimite(int dias) → Prorroga a data limite.

Dica: Use ArrayList<T> para a implementação da lista interna.