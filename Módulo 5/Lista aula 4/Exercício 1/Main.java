package org.example;

public class Main {
    public static void main(String[] args) {
        Banda BandaD = new Banda("DragonBregaZ", "Brega.");
        BandaD.mostraInfo();
        Membro[] membros = new Membro[4];
        Membro membro1 = new Membro("Vegeta", "Vocalista");
        membros [1] = membro1;
        Membro membro2 = new Membro("Babidi", "Baixista");
        membros [2] = membro2;
        Membro membro3 = new Membro("Mr Satan", "Guitarrista");
        membros [3] = membro3;
        BandaD.addMembroNovo(membros[1]);
        BandaD.addMembroNovo(membros[2]);
        BandaD.addMembroNovo(membros[3]);
        BandaD.listaMembroNovo();
        BandaD.listaMembroNovo();
        BandaD.listaMembroNovo();
        Musica[] musicas = new Musica[3];
        Musica musica1= new Musica("Saudade de Bulma", 3);
        musicas [1] = musica1;
        Musica musica2 = new Musica("Sorriso Resplandecente", 7);
        musicas [2] = musica2;
        BandaD.addMusicaNova(musicas [1]);
        BandaD.addMusicaNova(musicas [2]);
        System.out.println("Lista de músicas:");
        BandaD.listaMusicaNova();
        BandaD.listaMusicaNova();
        Empresario empresario = new Empresario("Son Goku", 123123123);
        System.out.println(empresario.getNome()+" é o empresário responsável pela banda.");


    }
}