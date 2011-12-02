package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;

/**
 * Entity implementation class for Entity: VAHTKOND_PIIRILOIGUL
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_PIIRILOIGUL extends BaseEntity implements Serializable {

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private VAHTKOND vAHTKOND;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	public VAHTKOND_PIIRILOIGUL() {
		super();
	}

	public Date getAlates() {
		return alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}

	public Date getKuni() {
		return kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}

	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}

	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}

	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}

	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
   
}
