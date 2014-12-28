package br.com.emanuelmm.rest_study_heroku.entity;

import java.io.Serializable;

/**
 *
 * @author Emanuel Cordeiro
 */
public class Funcionario implements Serializable {

    private int id;

    private String nome;

    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
