package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "GDC_ESPACIO")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Contenido implements Serializable {
    private static final long serialVersionUID = 1235287581L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CONTENIDO", nullable = false)
    private Integer pk;

    @OneToOne(mappedBy = "pk")
    @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO",
            insertable = false, updatable = false)
    Espacio espacio;

    @JoinColumn(name = "COD_CONTENIDO_PADRE", referencedColumnName = "COD_CONTENIDO_PADRE",
            insertable = false, updatable = false)
    @ManyToOne
    private Contenido contenidoPadre;

    @OneToMany(mappedBy = "codContenido")
    private List<ContenidoVersion> versiones;

    @Column(name = "TIPO_CONTENIDO", length = 2, nullable = false)
    private Integer tipoContenido;

    @Column(name = "NOMBRE", length = 256, nullable = false)
    private String nombre;

    @Column(name = "NOMBRE_ARCHIVO", length = 256, nullable = false)
    private String nombreArchivo;

    @Column(name = "VERSION", nullable = false)
    private BigDecimal version;

    @Column(name = "ESTADO", nullable = false)
    private Integer estado;

    public Contenido(Integer pk) {
        this.pk = pk;
    }
}
