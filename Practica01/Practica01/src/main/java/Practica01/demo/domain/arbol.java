package Practica01.demo.domain;

import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long id_arbol;

    @NotBlank
    @Column(name = "nombre_arbol", nullable = false)
    private String nombre_arbol;

    @Column(name = "anos_madera")
    private Integer anos_madera;

    @Column(name = "tipo_frutos")
    private String tipo_frutos;

    @Column(name = "rutaImagen")
    private String rutaImagen;

    @Column(name = "activo")
    private boolean activo;

    public arbol() {
    }

    public arbol(String nombre_arbol, boolean activo) {
        this.nombre_arbol = nombre_arbol;
        this.activo = activo;
    }
}
