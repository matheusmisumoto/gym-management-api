package dev.matheusmisumoto.gymmanagementapi.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	/**
	 * @param dataDeNacimento: members' date of birth
	 * @return list all members celebrating birthday on that date  
	 */
	
	List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
	
}
