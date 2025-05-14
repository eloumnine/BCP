package ma.bank.bcp.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE",
        discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    @Id
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    @ManyToOne
    @JoinColumn(name = "CODE_CLI")
    private Client client;
    @OneToMany(mappedBy = "compte")
    private Collection<Operation> operations;
}
