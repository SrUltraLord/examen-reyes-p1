package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "seg_usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = -4384023921630907199L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario", nullable = false)
    private Integer pk;

    @Column(name = "username", nullable = false, length = 32)
    private String username;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "clave", nullable = false, length = 64)
    private String clave;

    @OneToMany(mappedBy = "codUsuario")
    private List<UsuarioEspacio> usuarioEspacios;

    public Usuario(Integer pk) {
        this.pk = pk;
    }
}