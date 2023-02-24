package com.nl.TaskManager.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.nl.TaskManager.model.Status;
import com.nl.TaskManager.model.Tarefa;


public class TarefaDTO {
	

	private Integer id;
	@NotNull(message = "O campo Data inicio não pode ser nulo!")
	private LocalDate dataInicio;
	@NotNull(message = "O campo Data término não pode ser nulo!")
	private LocalDate dataTermino;
	@NotNull(message = "O campo Título não pode ser nulo!")
	private String titulo;
	private String descricao;
	private Status status;
	
	public TarefaDTO() {
		super();
	}
	
	public TarefaDTO(Tarefa tarefa) {
		super();
		this.id = tarefa.getId();
		this.dataInicio = tarefa.getDataInicio();
		this.dataTermino = tarefa.getDataTermino();
		this.titulo = tarefa.getTitulo();
		this.descricao = tarefa.getDescricao();
		this.status = tarefa.getStatus();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(@NotNull(message = "O campo Data inicio não pode ser nulo!") LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(@NotNull(message = "O campo Data término não pode ser nulo!") LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
