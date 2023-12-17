package br.org.com.recode.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.Cliente;
import br.org.com.recode.repository.ClienteRepository;
import br.org.com.recode.repository.DestinoRepository;
import br.org.com.recode.repository.PassagemRepository;
 
@Controller

@RequestMapping("/cliente")

public class ClienteController {


	@Autowired

	private ClienteRepository clienteRepository;

	 @Autowired

	    private PassagemRepository passagemRepository; 

	    @Autowired

	    private DestinoRepository destinoRepository; 

	@GetMapping

	public ModelAndView cliente() {

		ModelAndView modelAndView = new ModelAndView ("views/cliente/index.html");

		modelAndView.addObject("clientes",clienteRepository.findAll());

		modelAndView.addObject("passagens", passagemRepository.findAll()); 

        modelAndView.addObject("destino", destinoRepository.findAll()); 

		modelAndView.addObject("cliente", new Cliente());
 
		return modelAndView;

	}


	@PostMapping("/cadastro")

	public String cadastrar(@ModelAttribute("cliente") Cliente cliente) {
 
	
		

        clienteRepository.save(cliente);
 
        

		return "redirect:/cliente";

	}


	@GetMapping("/{id_cliente}/excluir")

	public String excluir(@PathVariable Long id_cliente) {

		clienteRepository.deleteById(id_cliente);
 
		return "redirect:/cliente";

	}

 
	}