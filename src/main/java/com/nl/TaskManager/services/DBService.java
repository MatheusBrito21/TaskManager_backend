package com.nl.TaskManager.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nl.TaskManager.model.Status;
import com.nl.TaskManager.model.Tarefa;
import com.nl.TaskManager.repositories.TarefaRepository;

@Service
public class DBService {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	public void iniciaDB() {
		
		List<Tarefa> tarefas = new ArrayList<>();
		
		tarefas.add(new Tarefa(LocalDate.now(),LocalDate.now().plusDays(2), "Testar DB", "Algo...", Status.ABERTA));
		tarefas.add(new Tarefa(LocalDate.now(),LocalDate.now().plusDays(2), "Testar Persistencia", "Algo...", Status.ABERTA));
		tarefas.add(new Tarefa(LocalDate.now(),LocalDate.now().plusDays(2), "Testar CRUD", "Algo...", Status.ABERTA));
		
		tarefaRepository.saveAll(tarefas);
		
		
	}
	
}
