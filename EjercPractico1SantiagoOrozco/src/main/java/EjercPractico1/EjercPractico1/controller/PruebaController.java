/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

package EjercPractico1.EjercPractico1.controller;

import EjercPractico1.EjercPractico1.service.NombreEntidadService;  // 🔄 CAMBIAR: Importar el servicio correcto
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/nombre-entidad")  // 🔄 CAMBIAR: Path base para los endpoints
public class NombreEntidadController {  // 🔄 CAMBIAR: Nombre del controlador
    
    @Autowired
    private NombreEntidadService nombreEntidadService;  // 🔄 CAMBIAR: Tipo y nombre del servicio
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var entidades = nombreEntidadService.getNombreEntidades(false);  // 🔄 CAMBIAR: Método del servicio
        model.addAttribute("entidades", entidades);  // 🔄 CAMBIAR: Nombre del atributo en el modelo
        model.addAttribute("totalEntidades", entidades.size());  // 🔄 CAMBIAR: Nombre del atributo en el modelo
        return "/nombre-entidad/listado";  // 🔄 CAMBIAR: Path a la vista
    }

}
*/ 
