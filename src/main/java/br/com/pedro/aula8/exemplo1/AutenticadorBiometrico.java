package br.com.pedro.aula8.exemplo1;

public class AutenticadorBiometrico implements Autenticacao {

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void biometricLogin(byte[] fingerprintData) {
        System.out.println("Autenticando com dados biométricos...");
    }

    @Override
    public void externalLogin(String token) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
