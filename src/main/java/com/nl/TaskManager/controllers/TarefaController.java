package com.nl.TaskManager.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nl.TaskManager.dtos.TarefaDTO;
import com.nl.TaskManager.model.Tarefa;
import com.nl.TaskManager.services.TarefaService;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;
	
	@GetMapping
	public ResponseEntity<List<TarefaDTO>> listarTarefas(){
		List<Tarefa> tarefas = tarefaService.listaTarefas();
		List<TarefaDTO> lista= tarefas.stream().map(x-> new TarefaDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
	}
	@GetMapping(path = "/abertas")
	public ResponseEntity<List<TarefaDTO>> listarTarefasAbertas(){
		List<Tarefa> tarefas = tarefaService.listaTarefasAbertas();
		List<TarefaDTO> lista= tarefas.stream().map(x-> new TarefaDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
	}
	@GetMapping(path = "/andamento")
	public ResponseEntity<List<TarefaDTO>> listarTarefasAndamento(){
		List<Tarefa> tarefas = tarefaService.listaTarefasAndamento();
		List<TarefaDTO> lista= tarefas.stream().map(x-> new TarefaDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
	}
	@GetMapping(path = "/fechadas")
	public ResponseEntity<List<TarefaDTO>> listarTarefasFechadas(){
		List<Tarefa> tarefas = tarefaService.listaTarefasFechadas();
		List<TarefaDTO> lista= tarefas.stream().map(x-> new TarefaDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity <TarefaDTO> obterTarefa(@PathVariable Integer id){
		Tarefa tarefa = tarefaService.obterTarefa(id);
		
		return ResponseEntity.ok().body(new TarefaDTO(tarefa));
	}
	
	@PostMapping
	public ResponseEntity<TarefaDTO> cadastrarTarefa(@RequestBody @Valid TarefaDTO tDTO){
		Tarefa tarefa = tarefaService.cadastarTarefa(tDTO);
		
		return ResponseEntity.ok().body(new TarefaDTO(tarefa));
	}
	
	@PutMapping(path="/update/{id}")
	public ResponseEntity<TarefaDTO> atualizarTarefa(@PathVariable Integer id,@RequestBody @Valid TarefaDTO tDTO){
		Tarefa tarefa = tarefaService.atualizarTarefa(id,tDTO);
		return ResponseEntity.ok().body(new TarefaDTO(tarefa));
	}
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<TarefaDTO> deletarTarefa(@PathVariable Integer id){
		tarefaService.deletarTarefa(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
