/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.citacoes.model;

import java.io.Serializable;

/**
 *
 * @author 31381243
 */
public class Usuario implements Serializable{
    private int id_usuario;
    private String nome;
    private String senha;

    public Usuario(int id_usuario, String nome, String senha) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String nome, String senha) {
        this.id_usuario = -1;
        this.nome = nome;
        this.senha = senha;
    }


    public Usuario() {
        this.id_usuario = -1;
        this.nome = "anonimo";
        this.senha = "1234567";
    }
    
    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nome=" + nome + ", senha=" + senha + '}';
    }
    
}
