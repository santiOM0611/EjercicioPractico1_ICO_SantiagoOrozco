/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EjercPractico1.EjercPractico1.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "medicamentos")  // Nombre de la tabla en la BD
public class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Nombre de la columna ID
    private Long id;  // Atributo de la clase
    
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
