package com.nl.TaskManager.controllers.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nl.TaskManager.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> tarefaNaoEncontrada(ObjectNotFoundException ex, HttpServletRequest request){
		StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(),
				"Tarefa não encontrada!", ex.getMessage(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
}
