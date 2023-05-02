package com.andpedroso.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andpedroso.spring.entities.Turma;
import com.andpedroso.spring.repositories.TurmaRepository;

@Service
public class TurmaService {
	@Autowired
	private TurmaRepository turmaRepository;
	public List<Turma> getAll(){
		List<Turma> result = turmaRepository.findAll();
		return result;
	}
	public Turma getById(Integer id) {
		Turma result = turmaRepository.findById(id).orElse(null);
		return result;
	}
	public Turma saveTurma(Turma turma) {
		return turmaRepository.save(turma);
	}
	public Turma updateTurma(Integer id, Turma turma) {
		Turma turmaAtualizada = turmaRepository.findById(id).orElse(null);
		if(turmaAtualizada != null) {
			turmaAtualizada.setDataFim(turma.getDataFim());
			turmaAtualizada.setDataInicio(turma.getDataInicio());
			turmaAtualizada.setDuracao(turma.getDuracao());
			turmaAtualizada.setHorario(turma.getHorario());
			turmaAtualizada.setInstrutor(turma.getInstrutor());
			return turmaRepository.save(turmaAtualizada);
		} else {
			return null;
		}
	}
	public Boolean deleteTurma(Integer id) {
		Turma turma = turmaRepository.findById(id).orElse(null);
		if(turma != null) {
			turmaRepository.delete(turma);
			return true;
		} else {
			return false;
		}
	}
}
