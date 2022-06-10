package dev.matheusmisumoto.gymmanagementapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import dev.matheusmisumoto.gymmanagementapi.entity.AvaliacaoFisica;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AvaliacaoFisicaForm;
import dev.matheusmisumoto.gymmanagementapi.entity.form.AvaliacaoFisicaUpdateForm;
import dev.matheusmisumoto.gymmanagementapi.repository.AlunoRepository;
import dev.matheusmisumoto.gymmanagementapi.repository.AvaliacaoFisicaRepository;
import dev.matheusmisumoto.gymmanagementapi.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(form.getPeso());
		avaliacaoFisica.setAltura(form.getAltura());
		
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
