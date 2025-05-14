package ma.bank.bcp.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

    private static final long serialVersionUID = 1L;
}
