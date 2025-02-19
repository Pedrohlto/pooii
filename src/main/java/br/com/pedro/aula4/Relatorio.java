package br.com.pedro.aula4;

import java.util.List;

public class Relatorio {

//    private RepositorioFuncionario repositorioFuncionario;

//    public Relatorio(RepositorioFuncionario repositorioFuncionario){
//        this.repositorioFuncionario = repositorioFuncionario;
//    }

    public String gerarRelatorio(Funcionario funcionario) {
        return "Funcionário: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo()
                + ", Salário: " + funcionario.getSalario();
    }

    public String gerarRelatorio(List<Funcionario> listaDeFuncionarios){

//        List<Funcionario> listaDois = repositorioFuncionario.listarFuncionarios();

//        for(int i =0 ; i < listaDeFuncionarios.size(); i++){
//            Funcionario funcionario = listaDeFuncionarios.get(i);
//            System.out.println(funcionario.getNome());
//        }
//
        String retorno = "";
        for(Funcionario funcionario : listaDeFuncionarios){
            retorno.concat(funcionario.getNome());
        }
//
//        listaDeFuncionarios.forEach(funcionario -> {
//            System.out.println(funcionario.getNome());
//        });
        return retorno;
    }

    public void exportarParaCSV(List<Funcionario> listaDeFuncionarios) {
        System.out.println("Exportando dados do funcionário para CSV...");
    }
}
