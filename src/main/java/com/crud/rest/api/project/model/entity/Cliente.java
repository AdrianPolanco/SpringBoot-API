package com.crud.rest.api.project.model.entity;

//Lombok es una libreria de Java que ayuda a reducir la verbosidad y codigo repetitivo a traves de anotaciones
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data //Agrega automaticamente todos los getters y setters y otros metodos como toString,equals y hashCode
@AllArgsConstructor //Genera automaticamente un constructor que aceptara todos los campos como parametros
@NoArgsConstructor //Genera automaticamente un constructor sin parametros
@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCliente;

    @Column(name = "nombre")
    private String Nombre;

    @Column(name = "apellido")
    private String Apellido;

    @Column(name = "correo")
    private String Correo;

    @Column(name = "fecha_registro")
    private Date FechaRegistro;
}
