package ec.edu.espe.arqui.reyesexamenp1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "GDC_ESPACIO")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Espacio implements Serializable {
    private static final long serialVersionUID = -8459128164149665569L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer pk;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "FECHA_CREACION", nullable = false)
    LocalDate fechaCreacion;
}
