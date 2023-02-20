package com.nl.TaskManager.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nl.TaskManager.dtos.TarefaDTO;

@Entity
@Table(name = "tarefa_tb")
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private LocalDateTime dataInicio;
	private LocalDateTime dataTermino;
	private String titulo;
	private String descricao;
	private Status status;
	
	public Tarefa() {
		super();
	}

	public Tarefa(LocalDateTime dataInicio, LocalDateTime dataTermino, String titulo, String descricao, Status status) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}
	
	public Tarefa(TarefaDTO tarefaDTO) {
		super();
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
	public LocalDateTime getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDateTime getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(LocalDateTime dataTermino) {
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
