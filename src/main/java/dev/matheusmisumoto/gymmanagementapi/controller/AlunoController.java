package dev.matheusmisumoto.gymmanagementapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import dev.matheusmisumoto.gymmanagementapi.entity.AvaliacaoFisica;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AlunoForm;
import dev.matheusmisumoto.gymmanagementapi.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl service;
	
	@GetMapping
	public List<Aluno> getAll() {
		return service.getAll();
	}
	
	@PostMapping
	public Aluno create(@RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaByAluno(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaByAluno(id);
	}
}
