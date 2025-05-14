package ma.bank.bcp.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP",
        discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */

    @Id @GeneratedValue
    private Long numero;
    private Date dateOperation;
    private double montant;
    @ManyToOne
    @JoinColumn(name = "CODE_CPTE")
    private Compte compte;
}
