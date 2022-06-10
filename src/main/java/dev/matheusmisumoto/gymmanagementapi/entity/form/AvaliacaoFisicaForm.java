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
public class AvaliacaoFisicaForm {
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "O ID do aluno precisa ser um número positivo")
	private Long alunoId;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "O peso precisa ser um número positivo")
	private double peso;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "A altura precisa ser um número positivo")
	private double altura;
	
}
