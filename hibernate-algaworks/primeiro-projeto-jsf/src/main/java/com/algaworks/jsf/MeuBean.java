package com.algaworks.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MeuBean implements Serializable {

	private String nome;

	public void transformar() {
            System.out.println("llamando metodo transformar");
		this.nome = this.nome.toUpperCase();
	}
	
	public String getNome() {
            System.out.println("obteniendo campo nome");
		return nome;
	}
	public void setNome(String nome) {
            System.out.println("seteando campo nome");
		this.nome = nome;
	}
        
        public MeuBean(){
            System.out.println("iniciando el bean");
        }
        
}
