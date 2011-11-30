package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

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
