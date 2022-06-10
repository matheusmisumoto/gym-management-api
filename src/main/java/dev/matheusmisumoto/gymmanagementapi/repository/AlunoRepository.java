package dev.matheusmisumoto.gymmanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
