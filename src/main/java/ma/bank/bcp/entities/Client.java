package ma.bank.bcp.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    @Id @GeneratedValue
    private Long code;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Collection<Compte> comptes;


}
