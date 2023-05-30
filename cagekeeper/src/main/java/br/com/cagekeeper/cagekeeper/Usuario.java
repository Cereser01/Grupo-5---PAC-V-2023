package br.com.cagekeeper.cagekeeper;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Usuario {
    @Id private Long id;
    private String nome;
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
    public void setId(Long id){
        this.id = id;
    };
    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // Método criptografia XOR - soma uma string com outra, repete.
    // Tem que testar, ver a questão de segurança.
    public String criptografar(String plaintext) {
        String key = this.nome;
        StringBuilder ciphertext = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            char k = key.charAt(keyIndex);
            char result = (char) (c ^ k);
            ciphertext.append(result);
            keyIndex = (keyIndex + 1) % key.length();
        }
        return ciphertext.toString();
    }

    public String decriptografar(String ciphertext) {
        String key = this.nome;
        StringBuilder plaintext = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            char k = key.charAt(keyIndex);
            char result = (char) (c ^ k);
            plaintext.append(result);
            keyIndex = (keyIndex + 1) % key.length();
        }
        return plaintext.toString();
    }

}
