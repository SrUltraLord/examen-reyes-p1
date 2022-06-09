package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "GDC_CONTENIDO_VERSION")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class ContenidoVersion {
    private static final long serialVersionUID = 8182377104L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CONTENIDO_VERSION", nullable = false)
    private Integer pk;

    @Column(name = "COD_CONTENIDO", nullable = false,
        insertable = false, updatable = false)
    private Integer codContenido;

    @Column(name = "HASH_ARCHIVO", length = 64, nullable = false)
    private String hashArchivo;

    @Column(name = "TAMANIO", nullable = false)
    private BigDecimal tamanio;

    @Column(name = "VERSION", nullable = false)
    private BigDecimal version;

    @Column(name = "COMENTARIO", length = 500)
    private String comentario;

    @Column(name = "FECHA_CREACION", nullable = false)
    LocalDateTime fechaHoraCreacion;

    // TODO: check this code
    @Column(name = "COD_USUARIO_CREACION", nullable = false)
    private Integer codUsuarioCreacion;

    public ContenidoVersion(Integer pk) {
        this.pk = pk;
    }
}
