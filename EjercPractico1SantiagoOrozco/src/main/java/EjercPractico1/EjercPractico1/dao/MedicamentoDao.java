/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package EjercPractico1.EjercPractico1.dao;

import EjercPractico1.EjercPractico1.domain.Medicamento;  // Importar la entidad correcta
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoDao extends JpaRepository<Medicamento, Long> {  // Nombre de la interfaz y tipo de entidad
}
