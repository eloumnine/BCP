package ma.bank.bcp.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

    private static final long serialVersionUID = 1L;
}
