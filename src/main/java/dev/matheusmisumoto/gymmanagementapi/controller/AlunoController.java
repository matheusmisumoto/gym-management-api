package dev.matheusmisumoto.gymmanagementapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import dev.matheusmisumoto.gymmanagementapi.entity.AvaliacaoFisica;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AlunoForm;
import dev.matheusmisumoto.gymmanagementapi.service.impl.AlunoServiceImpl;

// CONTROLLER => SERVICE => REPOSITORY => DATABASE

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl service;
	
	@GetMapping
	public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
								String dataDeNascimento) {
		return service.getAll(dataDeNascimento);
	}
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaByAluno(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaByAluno(id);
	}
	
}
