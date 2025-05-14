package ma.bank.bcp.entities;

import java.io.Serializable;
import java.util.Collection;


public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    private Long code;
    private String nom;
    private String email;
    private Collection<Compte> comptes;


}
