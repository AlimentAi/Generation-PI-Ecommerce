package com.generation.alimentai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class ModelCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome da categoria não pode estar vazio!")
	@Size(min = 5, message = "O nome da categoria precisa ser maior que 5 caracteres!")
	@Size(max = 50, message = "O nome da categoria precisa ser menor 50 caracteres!")
	private String nomeCategoria;
	
	@NotBlank(message = "A descrição de categoria não pode estar vazia!")
	@Size(min = 10, message = "A descrição precisa ter mais de 10 caracteres!")
	@Size(max = 255, message = "A descrição precisa ter menos de 255 caracteres!")
	private String descricaoCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricao_categoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
}