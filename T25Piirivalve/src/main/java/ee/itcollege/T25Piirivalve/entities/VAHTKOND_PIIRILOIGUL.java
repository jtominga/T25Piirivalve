package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: VAHTKOND_PIIRILOIGUL
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_PIIRILOIGUL extends BaseEntity implements Serializable {

	   
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@ManyToOne
	private VAHTKOND vAHTKOND;

	public VAHTKOND_PIIRILOIGUL() {
		super();
	}

	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}

	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}

	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}

	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
   
}
