
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService { //sirve para exponer los metodos que pueden interactuar con las diferentes categorias
    
    public List<Categoria> getCategorias(boolean activos);//cuando ponemos metodos que retornan ponerlo en plural
    
    public Categoria getCategoria(Categoria categoria);
    
}
