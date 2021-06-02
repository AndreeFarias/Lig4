package br.com.poli;

import lig4.*;
import java.util.Scanner;

public class Lig4 {

    //Instanciando interfaces
    public static InterfaceMenu im = new InterfaceMenu();
    public static InterfaceJogo ij = new InterfaceJogo();
    public static InterfaceFimDeJogo ifj = new InterfaceFimDeJogo();

    //Instanciando jogadores
    public static Jogador jogador1, jogador2;
    
    //Instanciando partida
    public static Partida partida;

    //Variáveis de fluxo
    public static int i;

    public static void main(String[] args) {
        //Mostrar menu
        im.setVisible(true);
    }

    //Definindo Jogadores e Partidas
    public static void confirmarJogadores(String nome1, String nome2) {
        jogador1 = new Jogador(nome1, 1);
        jogador2 = new Jogador(nome2, 2);
        partida = new Partida(jogador1, jogador2);
    }

    //Mostrar menu e esconder outras interfaces
    public static void abrirMenu() {
        im.setVisible(true);
        ij.setVisible(false);
        ifj.setVisible(false);
    }

    //Mostrar jogo e esconder outras interfaces
    public static void abrirJogo() {
        im.setVisible(false);
        ij.setVisible(true);
        ifj.setVisible(false);
    }

    //Mostrar encerramento e esconder outras interfaces
    public static void finalizarJogo() {
        im.setVisible(false);
        ij.setVisible(false);
        ifj.setVisible(true);
    }
}
