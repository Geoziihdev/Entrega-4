package br.org.com.recode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;



@Entity
@Table(name = "passagem")
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
  
    private String data;
    private String preco;
    


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente")
    private Cliente Cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDestino")
    private Destino destino;

	public Passagem() {
	}


	public Passagem(Long id, String data, String preco, br.org.com.recode.model.Cliente cliente, Destino destino) {
		this.id = id;
		this.data = data;
		this.preco = preco;
		Cliente = cliente;
		this.destino = destino;
	}

	// Construtores, getters e setters...

	
	public Long getId() {
		return id;
	}


	public Passagem(String data, String preco, br.org.com.recode.model.Cliente cliente, Destino destino) {
		this.data = data;
		this.preco = preco;
		Cliente = cliente;
		this.destino = destino;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getPreco() {
		return preco;
	}


	public void setPreco(String preco) {
		this.preco = preco;
	}


	public Cliente getCliente() {
		return Cliente;
	}


	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}


	public Destino getDestino() {
		return destino;
	}


	public void setDestino(Destino destino) {
		this.destino = destino;
	}
    
    
	
	
	}
