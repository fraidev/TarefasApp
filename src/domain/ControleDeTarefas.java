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
public class ControleDeTarefas {
    private List<Tarefa> tarefas;
    
    public ControleDeTarefas(){
        this.tarefas = new ArrayList<Tarefa>();
    }
    
    public void addTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }
    
    public void removeTarefa(Tarefa tarefa){
        this.tarefas.remove(tarefa);
    }
    
    public List<Tarefa> getTarefas(){
        return this.tarefas;
    }   
}
