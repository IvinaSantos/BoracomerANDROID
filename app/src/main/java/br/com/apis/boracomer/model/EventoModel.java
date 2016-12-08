package br.com.apis.boracomer.model;

/**
 * Created by ivina on 07/12/2016.
 */
public class EventoModel {

    private String nome, horario, descricao, data;

    public EventoModel(String nome, String horario, String descricao, String data){
        this.nome = nome;
        this.horario = horario;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }
}
