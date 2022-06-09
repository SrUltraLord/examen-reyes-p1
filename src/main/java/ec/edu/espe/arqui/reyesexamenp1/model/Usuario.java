package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "SEG_USUARIO")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Usuario implements Serializable {
    private static final long serialVersionUID = -6859898053368196963L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer pk;

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String username;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    @Column(name = "CLAVE", nullable = false)
    private String clave;

    public Usuario(Integer pk) {
        this.pk = pk;
    }
}
