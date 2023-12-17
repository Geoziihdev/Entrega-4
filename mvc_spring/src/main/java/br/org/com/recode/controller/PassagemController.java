package br.org.com.recode.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.Passagem;
import br.org.com.recode.repository.ClienteRepository;
import br.org.com.recode.repository.DestinoRepository;
import br.org.com.recode.repository.PassagemRepository;
 
@Controller

@RequestMapping("/passagem")

public class PassagemController {


	@Autowired

	private PassagemRepository passagemRepository;

	 @Autowired

	    private ClienteRepository clienteRepository; 

	    @Autowired

	    private DestinoRepository destinoRepository; 

	@GetMapping

	public ModelAndView passagem() {

		ModelAndView modelAndView = new ModelAndView ("views/passagem/index.html");

		modelAndView.addObject("passagems",passagemRepository.findAll());

		modelAndView.addObject("passagens", passagemRepository.findAll()); 

        modelAndView.addObject("destino", destinoRepository.findAll()); 

		modelAndView.addObject("passagem", new Passagem());
 
		return modelAndView;

	}


	@PostMapping("/cadastrar")

	public String cadastrar(@ModelAttribute("passagem") Passagem passagem) {
 
	
		

        passagemRepository.save(passagem);
 
        

		return "redirect:/passagem";

	}


	@GetMapping("/{id_compra}/excluir")

	public String excluir(@PathVariable Long id_passagem) {

		passagemRepository.deleteById(id_passagem);
 
		return "redirect:/passagem";

	}

 
	}