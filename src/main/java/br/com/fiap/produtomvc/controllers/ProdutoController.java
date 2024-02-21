package br.com.fiap.produtomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String adicionarProduto() {

    return "produto/novo-produto";
    }

    @PostMapping()
    public String insertProdutos() {
        return "redirect:/produtos";
    }

}
