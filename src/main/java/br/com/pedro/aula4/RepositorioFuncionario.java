package br.com.pedro.aula4;

import java.util.List;

public class RepositorioFuncionario {

    public void salvarNoBanco(Funcionario funcionario) {
        System.out.println("Salvando " + funcionario.getNome() + " no banco de dados...");
    }

    public List<Funcionario> listarFuncionarios() {
        System.out.println("Regra para consulta ao banco de dados");
        Funcionario funcionario1 = new Funcionario("Funcionario", "Analista"
                , 1000.00, "00000000000", "teste@gmail.com");
        return List.of(funcionario1);
    }
}
