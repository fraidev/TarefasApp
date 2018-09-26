/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Cardozo
 */
public class Tarefa {
    private int percentualConcluido = 0;
    private int numeroPrioridade;
    private String nome;
    private String detalhamento;
    private LocalDate dataLimite;
    private List<Item> itens;
    private EnumStatusTarefa status;

    public Tarefa(){
        this.itens = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        if((this.percentualConcluido + item.getPercentualCorrespondente()) <= 100){
            this.percentualConcluido += item.getPercentualCorrespondente();
            this.itens.add(item);
        }
    }
    
    public List<Item> getItens(){
        return this.itens;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPercentualConcluido(){
        return this.percentualConcluido;
    }
    public String getDetalhamento(){
        return this.detalhamento;
    }
    public LocalDate getDataLimite(){
        return this.dataLimite;
    }
    public void setPercentualConcluido(int percentualConcluido){
        this.percentualConcluido = percentualConcluido;
    }
    public void setDetalhamento(String detalhamento){
        this.detalhamento = detalhamento;
    }
    public void setDataLimite(LocalDate dataLimite){
        this.dataLimite = dataLimite;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void removeItem(Item item){
        this.percentualConcluido -= item.getPercentualCorrespondente();
        this.itens.remove(item);
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}
