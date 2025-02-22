package br.com.pedro.aula6.exemplo2;

public class FormatadorTexto {

    public String formatar(String texto, String tipo) {
        if (tipo.equalsIgnoreCase("maiusculo")) {
            return texto.toUpperCase();
        } else if (tipo.equalsIgnoreCase("minusculo")) {
            return texto.toLowerCase();
        } else if (tipo.equalsIgnoreCase("asterisco")) {
            return "*" + texto + "*"; // Simula negrito
        }
        return texto;
    }
}
