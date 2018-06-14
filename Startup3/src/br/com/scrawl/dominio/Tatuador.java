/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.dominio;

import java.util.Objects;


/**
 *
 * @author internet
 */
public class Tatuador {

   
    public String nomedeusuario;
    public String senhadeusuario;

    public String getNomedeusuario() {
        return nomedeusuario;
    }

    public void setNomedeusuario(String nomedeusuario) {
        this.nomedeusuario = nomedeusuario;
    }

    public String getSenhadeusuario() {
        return senhadeusuario;
    }

    public void setSenhadeusuario(String senhadeusuario) {
        this.senhadeusuario = senhadeusuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomedeusuario);
        hash = 67 * hash + Objects.hashCode(this.senhadeusuario);
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
        final Tatuador other = (Tatuador) obj;
        if (!Objects.equals(this.nomedeusuario, other.nomedeusuario)) {
            return false;
        }
        if (!Objects.equals(this.senhadeusuario, other.senhadeusuario)) {
            return false;
        }
        return true;
    }

    public Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    