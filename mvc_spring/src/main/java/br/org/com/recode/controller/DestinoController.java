package br.org.com.recode.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.Destino;
import br.org.com.recode.repository.DestinoRepository;
 
@Controller
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
	private DestinoRepository destinoRepository;
	@GetMapping
	public ModelAndView destino() {
		ModelAndView modelAndView = new ModelAndView ("views/destino/index.html");
		modelAndView.addObject("passagens",destinoRepository.findAll());
		modelAndView.addObject("destino", new Destino());
 
		return modelAndView;
	}
	@PostMapping("/cadastrar")
	public String cadastrar(Destino destino) {
		destinoRepository.save(destino);
 
		return "redirect:/destino";
	}
	@GetMapping("/{id_destino}/excluir")
	public String excluir(@PathVariable Long id_destino) {
		destinoRepository.deleteById(id_destino);
 
		return "redirect:/destino";
	}

 
	}