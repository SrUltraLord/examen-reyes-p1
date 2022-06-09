package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {
    private static final long serialVersionUID = -7374912659448674644L;
    @EmbeddedId
    private UsuarioEspacioPk pk;

    @MapsId("codEspacio")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_espacio", nullable = false)
    private Espacio codEspacio;

    @MapsId("codUsuario")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_usuario", nullable = false)
    private Usuario codUsuario;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    public UsuarioEspacio(UsuarioEspacioPk pk) {
        this.pk = pk;
    }
}