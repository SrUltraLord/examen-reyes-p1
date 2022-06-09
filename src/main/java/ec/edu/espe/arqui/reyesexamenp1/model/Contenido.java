package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "GDC_CONTENIDO")
public class Contenido implements Serializable {
    private static final long serialVersionUID = 3281221416592872220L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CONTENIDO", nullable = false)
    private Integer pk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COD_ESPACIO", nullable = false)
    private Espacio espacio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_CONTENIDO_PADRE")
    private Contenido contenidoPadre;

    @Column(name = "TIPO_CONTENIDO", nullable = false)
    private BigDecimal tipoContenido;

    @Column(name = "NOMBRE", nullable = false, length = 256)
    private String nombre;

    @Column(name = "NOMBRE_ARCHIVO", length = 256)
    private String nombreArchivo;

    @Column(name = "VERSION", precision = 4, scale = 2)
    private BigDecimal version;

    @Column(name = "ESTADO")
    private Integer estado;

    @OneToMany(mappedBy = "contenidoPadre")
    private List<Contenido> contenidos;

    @OneToMany(mappedBy = "codContenido")
    private List<ContenidoVersion> versiones;

    public Contenido(Integer pk) {
        this.pk = pk;
    }
}