package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RUUMIYKSUS
 *
 */
@Entity
@RooToString
@RooEntity

public class RUUMIYKSUS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ruumiyksus_ID;
	private static final long serialVersionUID = 1L;

	public RUUMIYKSUS() {
		super();
	}   
	public Long getRuumiyksus_ID() {
		return this.ruumiyksus_ID;
	}

	public void setRuumiyksus_ID(Long ruumiyksus_ID) {
		this.ruumiyksus_ID = ruumiyksus_ID;
	}
   
}
