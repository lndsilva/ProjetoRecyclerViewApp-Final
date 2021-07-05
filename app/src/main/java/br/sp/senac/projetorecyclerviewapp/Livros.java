package br.sp.senac.projetorecyclerviewapp;

public class Livros {
    //Atributos globais
    private String titulo;
    private String categoria;
    private String descricao;
    private int miniatura;

    //Criar o construtor
    public Livros(String titulo, String categoria, String descricao, int miniatura) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.miniatura = miniatura;
    }
    //Métodos de acesso - getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
