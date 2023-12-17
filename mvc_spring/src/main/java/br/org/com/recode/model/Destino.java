package br.org.com.recode.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Destino")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDestino;

    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPassagem")
    private Passagem passagem;



    // Construtores, getters e setters...





	public Destino(String nomeDestino, Passagem passagem) {
		this.nomeDestino = nomeDestino;
		this.passagem = passagem;
	}



	public Destino(Long id, String nomeDestino, Passagem passagem) {
		this.id = id;
		this.nomeDestino = nomeDestino;
		this.passagem = passagem;
	}



	public Destino() {
	}
	
	public Long getId() {
		return id;
	}
	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public String getNomeDestino() {
		return nomeDestino;
	}
	
	
	
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	
	
	
	public Passagem getPassagem() {
		return passagem;
	}
	
	
	
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	// toString
	@Override
	public String toString() {
		return "Destino{id=" + id + ", nomeDestino='" + nomeDestino + "'}";
	}
}
