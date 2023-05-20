package org.example;

public class Membro {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao){
        setNome(nome);
        setFuncao(funcao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
