package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    //retorna una categoria por ID
    public Categoria getCategoria(Categoria categoria);
    
    //se inserta un nuevo registro si el ID de la categoria esta vacio
    //se actualiza el registro si el ID de la categoria no esta vacio.
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
}
