/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class No {
    private int l;
    private int c;
    private No pai;
    private int custoHeuristica;//h
    private int custoFinal = 0; //g+h
    private int custoCaminho = 0;
    private int custo;
    public No(int l, int c){
        this.l = l;
        this.c = c;
    }

    /**
     * @return the l
     */
    public int getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(int l) {
        this.l = l;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }
    
  
    /**
     * @return the custoHeuristica
     */
    public int getCustoHeuristica() {
        return custoHeuristica;
    }

    /**
     * @param custoHeuristica the custoHeuristica to set
     */
    public void setCustoHeuristica(int custoHeuristica) {
        this.custoHeuristica = custoHeuristica;
    }

    /**
     * @return the custoFinal
     */
    public int getCustoFinal() {
        return custoFinal;
    }

    /**
     * @param custoFinal the custoFinal to set
     */
    public void setCustoFinal(int custoFinal) {
        this.custoFinal = custoFinal;
    }
    /**
     * @return the custo
     */
    public int getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(int custo) {
        this.custo = custo;
    }

    /**
     * @return the pai
     */
    public No getPai() {
        return pai;
    }

    /**
     * @param pai the pai to set
     */
    public void setPai(No pai) {
        this.pai = pai;
    }

    /**
     * @return the custoCaminho
     */
    public int getCustoCaminho() {
        return custoCaminho;
    }

    /**
     * @param custoCaminho the custoCaminho to set
     */
    public void setCustoCaminho(int custoCaminho) {
        this.custoCaminho += custoCaminho;
    }
    
    
}
