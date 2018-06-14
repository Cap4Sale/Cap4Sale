/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.dominio;

import java.util.Objects;

/**
 *
 * @author Thiago Vinicius
 */
public class Login {
    
     private String nomeTatuador;

    private String senha;

    public String getNomeTatuador() {
        return nomeTatuador;
    }

    public void setNomeTatuador(String nomeTatuador) {
        this.nomeTatuador = nomeTatuador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomeTatuador);
        hash = 67 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.nomeTatuador, other.nomeTatuador)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
}
