package com.nl.TaskManager.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nl.TaskManager.dtos.TarefaDTO;
import com.nl.TaskManager.model.Tarefa;
import com.nl.TaskManager.repositories.TarefaRepository;

@Service
public class TarefaService {
	@Autowired
	TarefaRepository tarefaRepository;
	
	public List<Tarefa> listaTarefas(){
		return tarefaRepository.findAll();
	}

	public Tarefa obterTarefa(Integer id) {
		Optional<Tarefa> tarefa = tarefaRepository.findById(id);
		return tarefa.orElseThrow(() -> new RuntimeException("Erro em achar tarefa"));
	}

	public Tarefa cadastarTarefa(@Valid TarefaDTO tDTO) {
		return tarefaRepository.save(new Tarefa(tDTO));
	}

	public Tarefa atualizarTarefa(Integer id, @Valid TarefaDTO tDTO) {
		tDTO.setId(id);
		Tarefa tarefa = obterTarefa(id);
		tarefa = new Tarefa(tDTO);
		
		return tarefaRepository.save(tarefa);
	}

	public void deletarTarefa(Integer id) {
		tarefaRepository.deleteById(id);
	}
	
}
