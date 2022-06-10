package dev.matheusmisumoto.gymmanagementapi.entity.form;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Generate getters, setters, equals, hashcode
@Data

//Mandatory for hibernate
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
}
