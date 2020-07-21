package com.example.ligadajustica;

public class Membros {
    private String nome;
    private String codinome;
    private String especie;
    private String habilidade;
    private String vulnerabilidade;
    private int nivelAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getVulnerabilidade() {
        return vulnerabilidade;
    }

    public void setVulnerabilidade(String vulnerabilidade) {
        this.vulnerabilidade = vulnerabilidade;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
