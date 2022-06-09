package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class UsuarioEspacioPk implements Serializable {
    private static final long serialVersionUID = -8343703319820752375L;
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    public UsuarioEspacioPk(Integer codEspacio, Integer codUsuario) {
        this.codEspacio = codEspacio;
        this.codUsuario = codUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioEspacioPk entity = (UsuarioEspacioPk) o;
        return Objects.equals(this.codUsuario, entity.codUsuario) &&
                Objects.equals(this.codEspacio, entity.codEspacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, codEspacio);
    }

}