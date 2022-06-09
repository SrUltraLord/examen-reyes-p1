package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {
    private static final long serialVersionUID = -2401031085050121571L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_espacio", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @OneToMany(mappedBy = "espacio")
    private List<Contenido> contenidos;

    @OneToMany(mappedBy = "codEspacio")
    private List<UsuarioEspacio> usuarioEspacios;

}