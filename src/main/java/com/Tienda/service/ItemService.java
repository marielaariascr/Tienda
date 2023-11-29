/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

/**
 *
 * @author mariassuarez
 */
import com.Tienda.dao.FacturaDao;
import com.Tienda.dao.ProductoDao;
import com.Tienda.dao.VentaDao;
import com.Tienda.domain.Factura;
import com.Tienda.domain.Item;
import com.Tienda.domain.Producto;
import com.Tienda.domain.Usuario;
import com.Tienda.domain.Venta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

public interface ItemService {     
    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    //Se recupera el registro que tiene el idItem pasado por parámetro
    //si no existe en la tabla se retorna null
    public Item get(Item item);
    
    //Se elimina el registro que tiene el idItem pasado por parámetro
    public void delete(Item item);
    
    //Si el objeto item tiene un idItem que existe en la tabla item
    //El registro de actualiza con la nueva información
    //Si el idItem NO existe en la tabla, se crea el registro con esa información
    public void save(Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
}
