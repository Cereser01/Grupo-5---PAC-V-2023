package br.com.cagekeeper.CageKeeper;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dados {
    @Id
    @GeneratedValue
    private Long id;
    public Long getId() {
		return id;
	}
	public List getDados() {
		return Dados;
	}
	public void setDados(List dados) {
		Dados = dados;
	}
	private List Dados;
	//Resolvi não utilizar essa classe por agora.
	//por porquisse, vou aplicar a criptografia aqui num control c + control v, usando uma chave fixa.
	//Método criptografia XOR - soma uma string com outra, repete.
    //Tem que testar, ver a questão de segurança.
    public String criptografar(String plaintext) {
		String key = "lobotomized";
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
		String key = "lobotomized";
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
