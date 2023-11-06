package org.example;
public class Aluno {
    private String nome;
    private float n1;
    private float n2;
    private float n3;
    private float media;

    public Aluno(String nome, float n1, float n2, float n3, float media) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public float getMedia() {
        return media;
    }
}