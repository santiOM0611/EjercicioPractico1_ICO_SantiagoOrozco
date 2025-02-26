/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

package EjercPractico1.EjercPractico1.service.impl;

import EjercPractico1.EjercPractico1.dao.NombreEntidadDao;  // 🔄 CAMBIAR: Importar el DAO correcto
import EjercPractico1.EjercPractico1.domain.NombreEntidad;  // 🔄 CAMBIAR: Importar la entidad correcta
import EjercPractico1.EjercPractico1.service.NombreEntidadService;  // 🔄 CAMBIAR: Importar el servicio correcto
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NombreEntidadServiceImpl implements NombreEntidadService {  // 🔄 CAMBIAR: Nombre de la clase e interfaz
    
    @Autowired
    private NombreEntidadDao nombreEntidadDao;  // 🔄 CAMBIAR: Tipo y nombre del DAO
    
    @Override
    @Transactional(readOnly=true)
    public List<NombreEntidad> getNombreEntidades(boolean filtro) {  // 🔄 CAMBIAR: Firma del método
        var lista = nombreEntidadDao.findAll();
        if (filtro) {
           lista.removeIf(e -> !e.isActivo());  // 🔄 CAMBIAR: Condición de filtrado según la entidad
        }
        return lista;
    }

}

*/ 