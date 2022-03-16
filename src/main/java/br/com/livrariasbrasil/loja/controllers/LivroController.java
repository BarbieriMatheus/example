package br.com.livrariasbrasil.loja.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.livrariasbrasil.loja.model.Livro;

@Controller
public class LivroController {

	@GetMapping("/livros")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("livros/listLivros");
		Livro livro1 = new Livro(new Long(1), "Harry Potter", "Um menino bruxo", new BigDecimal(25));
		Livro livro2 = new Livro(new Long(2), "Jogos Vorazes", "Uma menina rebelde", new BigDecimal(25));
		List<Livro> livros = Arrays.asList(livro1, livro2);
		modelAndView.addObject("livros", livros);
		return modelAndView;
	}
}
