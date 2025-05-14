package ma.bank.bcp.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CC")
public class CompteCourante extends Compte{

    private static final long serialVersionUID = 1L;
    /**
     * Attribute
     */
    private double decouvert;
}
