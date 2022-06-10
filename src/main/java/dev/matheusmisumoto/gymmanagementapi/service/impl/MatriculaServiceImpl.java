package dev.matheusmisumoto.gymmanagementapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import dev.matheusmisumoto.gymmanagementapi.entity.Matricula;
import dev.matheusmisumoto.gymmanagementapi.entity.form.MatriculaForm;
import dev.matheusmisumoto.gymmanagementapi.repository.AlunoRepository;
import dev.matheusmisumoto.gymmanagementapi.repository.MatriculaRepository;
import dev.matheusmisumoto.gymmanagementapi.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private MatriculaRepository matriculaRepository;
		
	@Autowired
	private AlunoRepository alunoRepository;
		
	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		matricula.setAluno(aluno);
		
		return matriculaRepository.save(matricula);
	}
		
	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}
	
	@Override
	public List<Matricula> getAll(String bairro) {
		if (bairro == null) {
			return matriculaRepository.findAll();
		} else {
			return matriculaRepository.findByAlunoBairro(bairro);
    	}
    }

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}