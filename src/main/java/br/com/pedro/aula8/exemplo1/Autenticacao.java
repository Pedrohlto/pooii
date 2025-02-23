package br.com.pedro.aula8.exemplo1;

public interface Autenticacao {

    void login(String username, String password);
    void biometricLogin(byte[] fingerprintData);
    void externalLogin(String token);

}
