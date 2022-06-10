package dev.matheusmisumoto.gymmanagementapi.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Generate getters, setters, equals, hashcode
@Data

//Mandatory for hibernate
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "O ID do aluno precisa ser um número positivo")
	private Long alunoId;

}
