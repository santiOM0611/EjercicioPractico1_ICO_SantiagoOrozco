/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjercPractico1.EjercPractico1.controller;

import EjercPractico1.EjercPractico1.service.MedicamentoService;  // Importar el servicio correcto
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/medicamentos")  // Path base para los medicamentos
public class MedicamentoController {
    
    @Autowired
    private MedicamentoService medicamentoService;  // Tipo y nombre del servicio
    
    @GetMapping("/listado")
    public String listadoMedicamentos(Model model) {
        var medicamentos = medicamentoService.getMedicamentos();  // Método del servicio
        model.addAttribute("medicamentos", medicamentos);  // Nombre del atributo en el modelo
        model.addAttribute("totalMedicamentos", medicamentos.size());  // Total de medicamentos
        return "/medicamentos/listado";  // Path a la vista
    }
}
