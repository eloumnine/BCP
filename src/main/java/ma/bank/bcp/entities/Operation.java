package ma.bank.bcp.entities;

import java.io.Serializable;
import java.util.Date;

public abstract class Operation implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    private Long numero;
    private Date dateOperation;
    private double montant;
    private Compte compte;
}
