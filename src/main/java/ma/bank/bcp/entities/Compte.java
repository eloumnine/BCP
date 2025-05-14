package ma.bank.bcp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public abstract class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private Client client;
    private Collection<Operation> operations;
}
