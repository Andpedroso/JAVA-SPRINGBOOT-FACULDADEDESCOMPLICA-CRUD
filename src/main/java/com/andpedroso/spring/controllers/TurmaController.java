package com.andpedroso.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andpedroso.spring.entities.Turma;
import com.andpedroso.spring.service.TurmaService;

@RestController
@RequestMapping(value = "/turmas")
public class TurmaController {
	@Autowired
	private TurmaService turmaService;
	@GetMapping
	public ResponseEntity<List<Turma>> getAll(){
		List<Turma> result = turmaService.getAll();
		if(!result.isEmpty())
			return new ResponseEntity<>(result, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Turma> getById(@PathVariable Integer id){
		Turma result = turmaService.getById(id);
		if(result != null)
			return new ResponseEntity<>(result, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	@PostMapping
	public ResponseEntity<Turma> saveTurma(@RequestBody Turma turma){
		return new ResponseEntity<>(turmaService.saveTurma(turma), HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Turma> updateTurma(@PathVariable Integer id, @RequestBody Turma turma) {
		Turma turmaAtualizada = turmaService.updateTurma(id, turma);
		if(turmaAtualizada != null)
			return new ResponseEntity<>(turmaAtualizada, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteCategoria(@PathVariable Integer id) {
		if(turmaService.deleteTurma(id))
			return new ResponseEntity<>(true, HttpStatus.OK);
		else
			return new ResponseEntity<>(false, HttpStatus.OK);
	}
}
