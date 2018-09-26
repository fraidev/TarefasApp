/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Felipe Cardozo
 */
public class Item {
    private String descricao;
    private LocalDate dataExecucao;
    private int percentualCorrespondente;
    
    public Item(){
    }
    
    public int getPercentualCorrespondente(){
        return this.percentualCorrespondente;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public LocalDate getDataExecucao(){
        return this.dataExecucao;
    }
    public void setPercentualCorrespondente(int percentualCorrespondente){
        this.percentualCorrespondente = percentualCorrespondente;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setDataExecucao(LocalDate dataExecucao){
        this.dataExecucao = dataExecucao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
