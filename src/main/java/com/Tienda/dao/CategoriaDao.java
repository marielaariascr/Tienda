
package com.Tienda.dao;  //es el que se va a conectar con la base de datos

import org.springframework.data.jpa.repository.JpaRepository;
import com.Tienda.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{  //La interface lo que hace es exponer metodos que pueden ser utilizados por alguien como contollers, alguien tiene que implementar logica
    
}
