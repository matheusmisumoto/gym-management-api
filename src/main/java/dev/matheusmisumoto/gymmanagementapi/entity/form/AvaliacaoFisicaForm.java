package dev.matheusmisumoto.gymmanagementapi.entity.form;

import java.time.LocalDate;

import dev.matheusmisumoto.gymmanagementapi.entity.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Generate getters, setters, equals, hashcode
@Data

//Mandatory for hibernate
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
	
	private Long alunoId;
	
	private double peso;
	
	private double altura;
	
}
