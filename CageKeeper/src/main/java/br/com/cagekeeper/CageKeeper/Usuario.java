package br.com.cagekeeper.CageKeeper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;
    private String Nome;
    private String password;
    private Dados dados;

    public Long getId(){
        return this.id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPassword() {
        String a = this.password;
        a = decriptografar(a);
        return a;
    }

    public void setPassword(String password) {
        password = criptografar(password);
        this.password = password;
    }

    public Dados getDados() {
        return this.dados;
    }

    public void setDados(Dados dados) {
        //tem que aplicar criptografia
        this.dados = dados;
    }
    //Método criptografia XOR - soma uma string com outra, repete.
    //Tem que testar, ver a questão de segurança.
    public String criptografar(String plaintext) {
    String key = this.Nome;
    StringBuilder ciphertext = new StringBuilder();
    int keyIndex = 0;
    for (int i = 0; i < plaintext.length(); i++) {
        char c = plaintext.charAt(i);
        char k = key.charAt(keyIndex);
        char result = (char)(c ^ k);
        ciphertext.append(result);
        keyIndex = (keyIndex + 1) % key.length(); 
    }
    return ciphertext.toString();
    }
    public String decriptografar(String ciphertext) {
    String key = this.Nome;
    StringBuilder plaintext = new StringBuilder();
    int keyIndex = 0;
    for (int i = 0; i < ciphertext.length(); i++) {
        char c = ciphertext.charAt(i);
        char k = key.charAt(keyIndex);
        char result = (char)(c ^ k);
        plaintext.append(result);
        keyIndex = (keyIndex + 1) % key.length();
    }
    return plaintext.toString();
}

}
