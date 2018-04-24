package br.uninove.aula.testefirebase.modelo;

/**
 * Created by Rafael on 23/04/2018.
 */

public class Pessoa {
    private String id;
    private String nome;
    private String email;

    public Pessoa() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;

    }
}
