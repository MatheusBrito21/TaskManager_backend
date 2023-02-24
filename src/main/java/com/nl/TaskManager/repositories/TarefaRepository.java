package com.nl.TaskManager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nl.TaskManager.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	@Query("SELECT u FROM Tarefa u WHERE STATUS = 0")
	List<Tarefa> findAllAbertas();
	
	@Query("SELECT u FROM Tarefa u WHERE STATUS = 1")
	List<Tarefa> findAllAndamento();
	
	@Query("SELECT u FROM Tarefa u WHERE STATUS = 2")
	List<Tarefa>findAllFechadas();

}
