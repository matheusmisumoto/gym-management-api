package dev.matheusmisumoto.gymmanagementapi.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Generate getters, setters, equals, hashcode
@Data

//Mandatory for hibernate
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
	
	@NotBlank(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres")
	private String nome;

	@NotBlank(message = "Preencha o campo corretamente.")
	@CPF(message = "'${validatedValue}' é inválido")
	private String cpf;
	
	@NotBlank(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres")
	private String bairro;
	
	@NotNull(message = "Preencha o campo corretamente.")
	@Past(message = "Data '${validatedValue}'")
	private LocalDate dataDeNascimento;
}
