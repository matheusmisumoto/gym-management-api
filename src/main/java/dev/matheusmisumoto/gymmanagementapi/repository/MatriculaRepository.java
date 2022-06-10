package dev.matheusmisumoto.gymmanagementapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.matheusmisumoto.gymmanagementapi.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

	/**
	 * @param bairro: search for an specific neighborhood
	 * @return List of members enrolled that lives in that neighborhood
	 *
	 */
	
	List<Matricula> findByAlunoBairro(String bairro);
	
	
	/*
	 * SAME AS:
	@Query(value = "SELECT * FROM tb_matriculas m " +
					"INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
					"WHERE a.bairro = :bairro", nativeQuery = true)
	
	// @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
	
	List<Matricula> findAlunosMatriculadosBairro(String bairro);
	*/
	
	
}
