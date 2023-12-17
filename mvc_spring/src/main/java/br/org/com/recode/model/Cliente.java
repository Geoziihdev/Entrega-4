package br.org.com.recode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.Table;


@Entity
@Table(name = "Cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nascimentoCliente;
    private String nomeCliente;
    private String cpfCliente;

    // Construtores, getters, setters...

   

	public Cliente() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNascimentoCliente() {
		return nascimentoCliente;
	}

	public void setNascimentoCliente(String nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Cliente(Long id, String nascimentoCliente, String nomeCliente, String cpfCliente) {
		this.id = id;
		this.nascimentoCliente = nascimentoCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}

	public Cliente(String nascimentoCliente, String nomeCliente, String cpfCliente) {
		this.nascimentoCliente = nascimentoCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
}
    	

	