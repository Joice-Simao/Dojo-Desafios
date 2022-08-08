/*
Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.
 O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.

As regras são as seguintes:

Pedra empata com Pedra e ganha de Tesoura
Tesoura empata com Tesoura e ganha de Papel
Papel empata com Papel e ganha de Pedra

 */

import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jogador1, jogador2;
        System.out.println("\u001b[7m Jokenpo \u001b[m");
        System.out.print("\u001b[36m\uD83D\uDD34 JOGADOR 1#\u001b[m \nDigite 1-Pedra 2-Papel 3-Tesoura > ");
        jogador1 = scanner.nextInt();

        System.out.print("\u001b[36m\uD83D\uDD34 JOGADOR 2#\u001b[m \nDigite 1-Pedra 2-Papel 3-Tesoura > ");
        jogador2 = scanner.nextInt();

        if (jogador1 == 1 && jogador2 == 3){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 1 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador1 == 2 && jogador2 == 1){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 1 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador1 == 3 && jogador2 == 2){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 1 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador2 == 1 && jogador1 == 3){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 2 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador2 == 2 && jogador1 == 1){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 2 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador2 == 3 && jogador1 == 2){
            System.out.println("\u001b[33m 🏆 \u001b[m \u001b[1mJogador 2 venceu !!!\u001b[33m🏆 \u001b[m");

        }else if (jogador1 == jogador2){
            System.out.println("Empate");

        } else{
            System.out.println("Valores inválidos !!!");
        }
    }
}