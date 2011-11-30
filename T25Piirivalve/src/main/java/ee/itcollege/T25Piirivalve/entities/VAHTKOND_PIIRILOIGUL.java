package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: VAHTKOND_PIIRILOIGUL
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_PIIRILOIGUL extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkond_piiriloigul_ID;
	private static final long serialVersionUID = 1L;

	public VAHTKOND_PIIRILOIGUL() {
		super();
	}   
	public Long getVahtkond_piiriloigul_ID() {
		return this.vahtkond_piiriloigul_ID;
	}

	public void setVahtkond_piiriloigul_ID(Long vahtkond_piiriloigul_ID) {
		this.vahtkond_piiriloigul_ID = vahtkond_piiriloigul_ID;
	}
   
}
