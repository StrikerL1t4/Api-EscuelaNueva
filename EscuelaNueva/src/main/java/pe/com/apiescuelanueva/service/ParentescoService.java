/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;


public interface ParentescoService {
     //funcion que le permita mostrar todos los datos
    List<ParentescoEntity> findAll(); 
    //funcion que permita mostrar todos los datos habilitados
    List<ParentescoEntity> findAllCustom();
    //funcion para poder buscar codigo
    Optional<ParentescoEntity> findById(Long id);
    //funcion para registrar datos
    ParentescoEntity add(ParentescoEntity p);
    //funcion para actualizar datos
    ParentescoEntity update(ParentescoEntity p);
    //funcion para eliminar datos
    ParentescoEntity delete(ParentescoEntity p);
    
}
