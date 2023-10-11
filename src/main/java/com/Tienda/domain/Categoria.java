
package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data  // nos facilita los set y get porque se crean automaticamente
@Entity //lo que hace es que esta clase va a ser una entidad. No se ponen saltos de linea incesarios
@Table(name = "categoria") //esto lo que hace es que hace el mapeo a la table de SQL llamada categoria
public class Categoria implements Serializable {  //lo que hace es convertir un objeto en algo mas por ejemplo para que se guarde en base de datos a camel case
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_categoria")
    private Long idCategoria; //No se pone como en la base datos porque lo que va a hacer es transformarlo por eso tiene que ponerse en mayuscula la C porque es reglas CAMEL CASe
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){}

    public Categoria(String descripcion, String rutaImagen, boolean activo) { //para este se selecciona todos menos categoria sino sigue aumentando
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
