package com.william.cadastropessoa.service;

import com.william.cadastropessoa.model.Pessoa;
import com.william.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Read
    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    // create
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // update
    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    // delete
    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
