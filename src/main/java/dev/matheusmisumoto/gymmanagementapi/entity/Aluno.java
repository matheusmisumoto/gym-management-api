package dev.matheusmisumoto.gymmanagementapi.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Generate getters, setters, equals, hashcode
@Data

// Mandatory for hibernate
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@Column(unique = true)
	private String cpf;

	private String bairro;

	private LocalDate dataDeNascimento;

	// LAZY = load this only if necessary
	@OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
	
	// Deal with some possible Exceptions
	@JsonIgnore
  	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
	
}
