package org.example;

import java.util.Scanner;

public class Banda {
    private String nome;
    private String genero;
    int contador=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;

    Scanner sc = new Scanner(System.in);
    public Banda(String nome, String genero){
        setNome(nome);
        setGenero(genero);
    }

    public void mostraInfo(){
        String aux1 = getNome();
        String aux2 = getGenero();
        System.out.println("A Banda " + aux1 + " é do genero " + aux2);
    }
    Musica[] musicas = new Musica[3];
    public void addMusicaNova(Musica musica){
            musicas [contador] = musica;
            contador++;
        }

    public void listaMusicaNova(){
        System.out.println("Música "+(contador4+1)+" "+musicas [contador4].getNome());
        contador4++;
    }
    Membro[] membros = new Membro[4];
    public void addMembroNovo(Membro membro){
            membros [contador2] = membro;
            contador2++;
 }
    public void listaMembroNovo(){

            System.out.println("O membro "+membros [contador3].getNome() + " é o " + membros [contador3].getFuncao()+".");
            contador3++;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    Empresario empresario = new Empresario("Son Goku", 123123123);
}
