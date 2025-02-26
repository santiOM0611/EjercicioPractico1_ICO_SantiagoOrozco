/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


package EjercPractico1.EjercPractico1.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "NOMBRE_TABLA")  // 🔄 CAMBIAR: Nombre de la tabla en la nueva BD
public class NombreEntidad implements Serializable {  // 🔄 CAMBIAR: Nombre de la clase según entidad

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nombre")  // 🔄 CAMBIAR: Nombre de la columna ID en la nueva BD
    private Long idNombre;  // 🔄 CAMBIAR: Nombre del atributo según convención Java
    
    // 🔄 CAMBIAR: Agregar todos los atributos necesarios para mapear las columnas
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}
*/ 
