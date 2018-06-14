/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.business.interfaces;

import br.com.scrawl.dominio.Tatuador;
import java.util.List;

/**
 *
 * @author internet
 */
public interface TatuadorInterface {
    
    public Tatuador salvarTatuador(Tatuador tatuadorr);
    
        
    public List<Tatuador> buscarTatuadorPorNome(String nome);
    
    public List<Tatuador> buscarTodosTatuadores();

    public Tatuador salvarTatuador(String nomeCadastro, String senha);
    
        
}
