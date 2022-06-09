package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {
    private static final long serialVersionUID = -3176150544669142317L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer pk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_contenido", nullable = false)
    private Contenido codContenido;

    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;

    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;

    @Column(name = "tamanio", nullable = false, precision = 9)
    private BigDecimal tamanio;

    @Column(name = "version", nullable = false, precision = 4, scale = 2)
    private BigDecimal version;

    @Column(name = "comentario", length = 500)
    private String comentario;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

    public ContenidoVersion(Integer pk) {
        this.pk = pk;
    }
}