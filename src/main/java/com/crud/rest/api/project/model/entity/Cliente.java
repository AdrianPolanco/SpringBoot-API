package com.crud.rest.api.project.model.entity;

//Lombok es una libreria de Java que ayuda a reducir la verbosidad y codigo repetitivo a traves de anotaciones
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data //Agrega automaticamente todos los getters y setters y otros metodos como toString,equals y hashCode
@AllArgsConstructor //Genera automaticamente un constructor que aceptara todos los campos como parametros
@NoArgsConstructor //Genera automaticamente un constructor sin parametros
public class Cliente {
    private Integer IdCliente;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private Date FechaRegistro;
}
