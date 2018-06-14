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
public class Arte {

    public static Object getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String nomedaarte;
    public String legenda;

    public String getNomedaarte() {
        return nomedaarte;
    }

    public void setNomedaarte(String nomedaarte) {
        this.nomedaarte = nomedaarte;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nomedaarte);
        hash = 89 * hash + Objects.hashCode(this.legenda);
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
        final Arte other = (Arte) obj;
        if (!Objects.equals(this.nomedaarte, other.nomedaarte)) {
            return false;
        }
        if (!Objects.equals(this.legenda, other.legenda)) {
            return false;
        }
        return true;
    }

    public Object getNomeUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
      
}
