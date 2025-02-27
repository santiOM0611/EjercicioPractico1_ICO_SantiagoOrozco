/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjercPractico1.EjercPractico1.service.impl;

import EjercPractico1.EjercPractico1.dao.MedicamentoDao;  // Importar el DAO correcto
import EjercPractico1.EjercPractico1.domain.Medicamento;  // Importar la entidad correcta
import EjercPractico1.EjercPractico1.service.MedicamentoService;  // Importar el servicio correcto
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoDao medicamentoDao;  // Tipo y nombre del DAO
    
    @Override
    @Transactional(readOnly=true)
    public List<Medicamento> getMedicamentos() {  // Método para obtener todos los medicamentos
        return medicamentoDao.findAll();  // Retorna todos los medicamentos de la BD
    }
}
