package br.sp.senac.projetorecyclerviewapp;

public class Livros {

    //Atributos globais

    private String titulo;
    private String categoria;
    private String descricao;
    private int miniatura;
    
    //construtor vazio
    public Livros() {
    }
    //construtor com parâmetros
    public Livros(String titulo, String categoria, String descricao, int miniatura) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.miniatura = miniatura;
    }
    //métodos de acesso Get e Set
    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
