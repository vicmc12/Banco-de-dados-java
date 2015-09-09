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
public class Usuario_info implements Serializable {
    
    private int id_usuario_info, id_usuario;
    private String nome, email;

    public Usuario_info(int id_usuario_info, int id_usuario, String nome, String email) {
        this.id_usuario_info = id_usuario_info;
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
    }

    public Usuario_info() {
        this.id_usuario_info = -1;
        this.id_usuario = -1;
        this.nome = "anonimo";
        this.email = "anonimo@email.com";
    }

    public int getId_usuario_info() {
        return id_usuario_info;
    }

    public void setId_usuario_info(int id_usuario_info) {
        this.id_usuario_info = id_usuario_info;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario_info{" + "id_usuario_info=" + id_usuario_info + ", id_usuario=" + id_usuario + ", nome=" + nome + ", email=" + email + '}';
    }
    
}
