package com.Tienda.controller;

import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String page(Model model) {
        List<Categoria> listadoCategorias= categoriaService.getCategorias(false);
        model.addAttribute("categorias", listadoCategorias);
        model.addAttribute("TotalCategorias", listadoCategorias.size());
        
        return "/categoria/listado";
    }
    
}
