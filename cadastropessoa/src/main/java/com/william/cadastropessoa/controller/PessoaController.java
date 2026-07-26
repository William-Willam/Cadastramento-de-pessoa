package com.william.cadastropessoa.controller;

import com.william.cadastropessoa.model.Pessoa;
import com.william.cadastropessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/pessoas")
    public String listar(Model model) {
        model.addAttribute("pessoas", pessoaService.listarTodas());
        return "lista";
    }

    @GetMapping("/pessoas/novo")
    public String novoFormulario(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "formulario";
    }

    @PostMapping("/pessoas/salvar")
    public String salvar(@ModelAttribute Pessoa pessoa) {
        pessoaService.salvar(pessoa);
        return "redirect:/pessoas";
    }

    @GetMapping("/pessoas/editar/{id}")
    public String editarFormulario(@PathVariable Long id, Model model){
        model.addAttribute("pessoa", pessoaService.buscarPorId(id));
        return "formulario";
    }

    @GetMapping("/pessoas/deletar/{id}")
    public String deletarFormulario(@PathVariable Long id){
        pessoaService.deletar(id);
        return "redirect:/pessoas";
    }

}