
package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  //siempre va en las clases impl
public class CategoriaServiceImpl implements CategoriaService{ //si implemento esta interfaz tengo que implementar la logica de los otros los mismos metods del otro

    @Autowired//utilizar la variable en varias partes del codigo si tener que llamarla
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)//se usa solo para cuando vaya a leer los datos para que no modifique las tablas
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias = categoriaDao.findAll();
    
       if (activos){
           categorias.removeIf(c -> !c.isActivo()); //lo que hace es que llama a todos los que is activo es falso
         }
                   
        return categorias;
    }
    
    @Override
    public Categoria getCategoria (Categoria categoria) {
       return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
   
}
