package br.com.pedro.aula8.exemplo1;

public class AutenticadorSenha {

    public void login(String username, String password) {
        System.out.println("User " + username + " authenticated via password.");
    }

    public void biometricLogin(byte[] fingerprintData) {

        throw new UnsupportedOperationException("não suportado");
    }

    public void externalLogin(String token) {
        throw new UnsupportedOperationException("Não Suportado");
    }

}
