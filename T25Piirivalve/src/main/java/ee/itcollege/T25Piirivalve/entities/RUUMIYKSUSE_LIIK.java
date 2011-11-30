package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RUUMIYKSUSE_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class RUUMIYKSUSE_LIIK implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ruumiyksuse_liik_ID;
	private static final long serialVersionUID = 1L;

	public RUUMIYKSUSE_LIIK() {
		super();
	}   
	public Long getRuumiyksuse_liik_ID() {
		return this.ruumiyksuse_liik_ID;
	}

	public void setRuumiyksuse_liik_ID(Long ruumiyksuse_liik_ID) {
		this.ruumiyksuse_liik_ID = ruumiyksuse_liik_ID;
	}
   
}
