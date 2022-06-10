package dev.matheusmisumoto.gymmanagementapi.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import dev.matheusmisumoto.gymmanagementapi.entity.AvaliacaoFisica;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AlunoForm;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AlunoUpdateForm;
import dev.matheusmisumoto.gymmanagementapi.infra.utils.JavaTimeUtils;
import dev.matheusmisumoto.gymmanagementapi.repository.AlunoRepository;
import dev.matheusmisumoto.gymmanagementapi.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		
		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		if (dataDeNascimento == null) { 
			return repository.findAll();
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return repository.findByDataDeNascimento(localDate);
		}
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaByAluno(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno.getAvaliacoes();
	}
	
}
