package com.itallo.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itallo.bookstore.domain.Categoria;
import com.itallo.bookstore.domain.Livro;
import com.itallo.bookstore.repositories.CategoriaRepository;
import com.itallo.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Categoria cat1 = new Categoria(null, "Informatica", "Livros de Ti");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsun", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		categoriaRepository.saveAll(Arrays.asList(cat1));
		livroRepository.saveAll(Arrays.asList(l1));
	}

}
