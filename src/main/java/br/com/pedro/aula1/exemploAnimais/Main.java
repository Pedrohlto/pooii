package br.com.pedro.aula1.exemploAnimais;

public class Main {


    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.setNome("Nome do Gato");
        gato.setDisponivelParaAdocao(true);
        gato.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.setDisponivelParaAdocao(true);
        cachorro.setNome("Nome do Cachorro");
        cachorro.emitirSom();

        Pessoa pedro = new Pessoa();
        pedro.setNome("Pedro");
        pedro.setTelefone("11999999999");
        pedro.adotar(gato);
        pedro.adotar(cachorro);

        Animal adotado = pedro.getAnimalAdotado();
        System.out.println("Nome do Animal adotado " + adotado.getNome());
//

//        Animal cachorroLulu = new Animal();
//        cachorroLulu.setNome("Lulu");
//        cachorroLulu.setRaca("Poodle");
//        cachorroLulu.setCor("Branco");
//        cachorroLulu.setDataNascimento("10/02/2025");
//        cachorroLulu.setDisponivelParaAdocao(true);
//        cachorroLulu.setSexo("Macho");
//
//
//
//        Pessoa pedro = new Pessoa();
//        pedro.setNome("Pedro");
//        pedro.setTelefone("11999999999");
//
//        pedro.adotar(cachorroLulu);
//
//        Animal adotado = pedro.getAnimalAdotado();
//        System.out.println("Nome do Animal adotado " + adotado.getNome());
    }
}
