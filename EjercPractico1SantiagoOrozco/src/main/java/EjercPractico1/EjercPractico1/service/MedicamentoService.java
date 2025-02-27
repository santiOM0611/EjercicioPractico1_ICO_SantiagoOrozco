/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package EjercPractico1.EjercPractico1.service;

import EjercPractico1.EjercPractico1.domain.Medicamento;  // Importar la entidad correcta
import java.util.List;

public interface MedicamentoService {  // Nombre de la interfaz
    
    // Método para obtener la lista de medicamentos
    List<Medicamento> getMedicamentos();  // Método que obtiene todos los medicamentos
}
