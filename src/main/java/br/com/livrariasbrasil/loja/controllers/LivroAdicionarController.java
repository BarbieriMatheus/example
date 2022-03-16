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
public class LivroAdicionarController {
	@GetMapping("/livros/adicionar")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("livros/addLivros");
		return modelAndView;
	}
}
