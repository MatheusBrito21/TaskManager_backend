package com.nl.TaskManager.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.nl.TaskManager.dtos.TarefaDTO;

@Entity
@Table(name = "tarefa_tb")
public class Tarefa implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	private String titulo;
	private String descricao;
	private Status status;
	
	public Tarefa() {
		super();
	}

	public Tarefa(LocalDate dataInicio, LocalDate dataTermino, String titulo, String descricao, Status status) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}
	
	public Tarefa(TarefaDTO tarefaDTO) {
		super();
		this.id = tarefaDTO.getId();
		this.dataInicio = tarefaDTO.getDataInicio();
		this.dataTermino = tarefaDTO.getDataTermino();
		this.titulo = tarefaDTO.getTitulo();
		this.descricao = tarefaDTO.getDescricao();
		this.status = tarefaDTO.getStatus();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public @NotNull(message = "O campo Data inicio não pode ser nulo!") LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public @NotNull(message = "O campo Data término não pode ser nulo!") LocalDate getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(LocalDate dataTermino) {
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
