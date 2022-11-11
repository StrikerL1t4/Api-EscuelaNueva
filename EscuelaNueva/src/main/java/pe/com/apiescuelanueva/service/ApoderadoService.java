/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;

/**
 *
 * @author RONALD
 */
public interface ApoderadoService {
     //funcion que le permita mostrar todos los datos
    List<ApoderadoEntity> findAll(); 
    //funcion que permita mostrar todos los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    //funcion para poder buscar codigo
    Optional<ApoderadoEntity> findById(Long id);
    //funcion para registrar datos
    ApoderadoEntity add(ApoderadoEntity a);
    //funcion para actualizar datos
    ApoderadoEntity update(ApoderadoEntity a);
    //funcion para eliminar datos
    ApoderadoEntity delete(ApoderadoEntity a);
}
