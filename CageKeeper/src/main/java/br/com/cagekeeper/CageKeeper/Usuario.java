package br.com.cagekeeper.CageKeeper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;
    private String Nome;
    private String password;
    private String dados;

    public String getDados() {
        String a = this.dados;
        decriptografar(a);
        return a;
    }

    public void setDados(String dados) {
        String a = criptografar(dados);
        this.dados = a;
    }

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
        String a = criptografar(password);
        this.password = a;
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
