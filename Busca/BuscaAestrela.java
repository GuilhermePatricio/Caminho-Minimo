/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import Model.No;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import javax.swing.JLabel;

/**
 *
 * @author Gui
 */
public final class BuscaAestrela {

    private No[][] mapa;
    private final PriorityQueue<No> nosNaoVisitados;//uma fila de prioridade organizada de acordo com os custos finais de cada nó
    private boolean[][] nosVisitados;//vetor que armazena se a posição já foi ou não visitada
    private int inicialL;
    private int inicialC;
    private int finalL;
    private int finalC;
    private int pingenteVermelhoC;
    private int pingenteVermelhoL;
    private int pingenteVerdeC;
    private int pingenteVerdeL;
    private int pingenteAzulC;
    private int pingenteAzulL;
    private int espadaL;
    private int espadaC;
    private int linkL;
    private int linkC;
    private int custoCaminho = 0;
    private ArrayList<No> caminho;

    public BuscaAestrela(int largura, int altura, int inicialL, int inicialC, int finalL, int finalC, int pingenteVerteL, int pingenteVerdeC, int pingenteVermelhoL, int pingenteVermelhoC, int pingenteAzulL, int pingenteAzulC, int[][] matriz, JLabel[][] M) {
        this.espadaL = finalL;
        this.espadaC = finalC;
        this.linkL = inicialL;
        this.linkC = inicialC;
        this.pingenteAzulC = pingenteAzulC;
        this.pingenteAzulL = pingenteAzulL;
        this.pingenteVerdeC = pingenteVerdeC;
        this.pingenteVerdeL = pingenteVerteL;
        this.pingenteAzulC = pingenteAzulC;
        this.pingenteAzulL = pingenteAzulL;
        this.pingenteVermelhoC = pingenteVermelhoC;
        this.pingenteVermelhoL = pingenteVermelhoL;

        caminho = new ArrayList();
        mapa = new No[largura][altura];
        nosVisitados = new boolean[largura][altura];
        nosNaoVisitados = new PriorityQueue<>(
                new Comparator<No>() {
            @Override
            public int compare(No n1, No n2) {
                if (n1.getCustoFinal() > n2.getCustoFinal()) {
                    return 1;
                } else if (n1.getCustoFinal() < n2.getCustoFinal()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
        );

        ArrayList<No> ordemPingente;
        ordemPingente = melhorOrdemPingente();//determina a ordem em que os pingentes vao ser visitados

        this.finalL = espadaL;
        this.finalC = espadaC;
        this.inicialC = ordemPingente.get(0).getC();
        this.inicialL = ordemPingente.get(0).getL();

        atualizaMapa(matriz);
        encontraCaminho();
        caminho(nosVisitados);

        this.finalL = ordemPingente.get(0).getL();
        this.finalC = ordemPingente.get(0).getC();
        this.inicialC = ordemPingente.get(1).getC();
        this.inicialL = ordemPingente.get(1).getL();

        atualizaMapa(matriz);
        encontraCaminho();
        caminho(nosVisitados);

        this.finalL = ordemPingente.get(1).getL();
        this.finalC = ordemPingente.get(1).getC();
        this.inicialC = ordemPingente.get(2).getC();
        this.inicialL = ordemPingente.get(2).getL();

        atualizaMapa(matriz);
        encontraCaminho();
        caminho(nosVisitados);

        this.finalL = ordemPingente.get(2).getL();
        this.finalC = ordemPingente.get(2).getC();
        this.inicialC = linkC;
        this.inicialL = linkL;

        atualizaMapa(matriz);
        encontraCaminho();
        caminho(nosVisitados);

        System.out.println("Custo caminho final = " + custoCaminho);
    }

    public ArrayList<No> melhorOrdemPingente() {
        int L;
        int C;
        ArrayList<No> ordem;
        ordem = new ArrayList<>();
        PriorityQueue<No> compara;
        compara = new PriorityQueue<>(
                new Comparator<No>() {
            @Override
            public int compare(No n1, No n2) {
                if (n1.getCustoHeuristica() > n2.getCustoHeuristica()) {
                    return 1;
                } else if (n1.getCustoHeuristica() < n2.getCustoHeuristica()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
        );

        No vermelho = new No(this.pingenteVermelhoL, this.pingenteVermelhoC);
        No verde = new No(this.pingenteVerdeL, this.pingenteVerdeC);
        No azul = new No(this.pingenteAzulL, this.pingenteAzulC);

        //preenche os nós com o valor heuristico referente a posição dos nós até a posição final
        //h = distancia em quadrados dos pingentes até o final, onde cada quadrado custa 1
        vermelho.setCustoHeuristica(Math.abs(this.pingenteVermelhoC - this.espadaC) + Math.abs(this.pingenteVermelhoL - this.espadaL));
        verde.setCustoHeuristica(Math.abs(this.pingenteVerdeC - this.espadaC) + Math.abs(this.pingenteVerdeL - this.espadaL));
        azul.setCustoHeuristica(Math.abs(this.pingenteAzulC - this.espadaC) + Math.abs(this.pingenteAzulL - this.espadaL));

        //add os nós na lista de prioridade
        compara.add(vermelho);
        compara.add(azul);
        compara.add(verde);
        ordem.add(compara.remove());//add o nó de menor custo h na lista de ordem

        compara.remove();
        compara.remove();
        L = ordem.get(0).getL();
        C = ordem.get(0).getC();

        //preenche os nós com o valor heuristico referente a posição do nó de menor custo h
        vermelho.setCustoHeuristica(Math.abs(this.pingenteVermelhoC - C) + Math.abs(this.pingenteVermelhoL - L));
        verde.setCustoHeuristica(Math.abs(this.pingenteVerdeC - C) + Math.abs(this.pingenteVerdeL - L));
        azul.setCustoHeuristica(Math.abs(this.pingenteAzulC - C) + Math.abs(this.pingenteAzulL - L));

        if (azul.getCustoHeuristica() != 0) {
            compara.add(azul);
        }

        if (vermelho.getCustoHeuristica() != 0) {
            compara.add(vermelho);
        }

        if (verde.getCustoHeuristica() != 0) {
            compara.add(verde);
        }

        ordem.add(compara.remove());//add o nó com menor custo h na lista de ordem
        ordem.add(compara.remove());

        return ordem;//retorna a lista com a ordem de pingentes 
    }

    public void atualizaMapa(int[][] matriz) {
        nosVisitados = new boolean[matriz.length][matriz.length];
        for (int c = 0; c < matriz.length; c++) {
            for (int l = 0; l < matriz.length; l++) {
                mapa[c][l] = new No(c, l);
                mapa[c][l].setCustoHeuristica(Math.abs(c - this.finalC) + Math.abs(l - this.finalL));//heuristica
                mapa[c][l].setCusto(matriz[c][l]);
            }
        }
    }

    public void encontraCaminho() {
        mapa[this.inicialL][this.inicialC].setCusto(0); //custo da posição inicial = 0
        nosNaoVisitados.add(mapa[this.inicialL][this.inicialC]); //add o nó na lista de nao visitados
        No atual;

        while (!nosNaoVisitados.isEmpty()) {
            atual = nosNaoVisitados.poll();//nó atual é igual ao nó nao visitado com menor custo
            if (atual == null) {
                break;
            }
            nosVisitados[atual.getL()][atual.getC()] = true;//marca que o nó foi visitado

            No destino;

            if (atual.getL() - 1 >= 0) {//verifica se tem caminho pra cima

                destino = mapa[atual.getL() - 1][atual.getC()];
                comparaCaminho(atual, destino);
            }

            if (atual.getL() + 1 < mapa.length) {//verifica se tem caminho pra baixo

                destino = mapa[atual.getL() + 1][atual.getC()];
                comparaCaminho(atual, destino);
            }

            if (atual.getC() - 1 >= 0) {//verifica se tem caminho pra esquerda

                destino = mapa[atual.getL()][atual.getC() - 1];
                comparaCaminho(atual, destino);
            }

            if (atual.getC() + 1 < mapa.length) {//verifica se tem caminho pra direita

                destino = mapa[atual.getL()][atual.getC() + 1];
                comparaCaminho(atual, destino);
            }
        }
    }

    private void comparaCaminho(No atual, No destino) {
        if (destino == null || nosVisitados[destino.getL()][destino.getC()]) {
            return;
        }

        int custoAtual = (atual.getCustoFinal() - atual.getCustoHeuristica()) + destino.getCustoHeuristica() + destino.getCusto();
        if ((!nosNaoVisitados.contains(destino)) || custoAtual < destino.getCustoFinal()) {
            destino.setCustoFinal(custoAtual);
            destino.setPai(atual);

            if (!nosNaoVisitados.contains(destino)) {
                nosNaoVisitados.add(destino);
            }
        }
    }

    public void caminho(boolean[][] nosVisitados) {

        if (nosVisitados[this.finalL][this.finalC]) {
            No atual = mapa[this.finalL][this.finalC];
            caminho.add(atual);
            custoCaminho += atual.getCusto();
            while (atual.getPai() != null) {
                caminho.add(atual.getPai());
                custoCaminho += atual.getPai().getCusto();
                atual = atual.getPai();
            }

        } else {
            System.out.println("Caminho invalido");
        }
    }

    public ArrayList<No> getCaminho() {
        return caminho;
    }

}
