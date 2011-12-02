package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Entity implementation class for Entity: PIIRILOIGU_HALDAJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIGU_HALDAJA extends BaseEntity implements Serializable {

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private VAEOSA vAEOSA;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	public PIIRILOIGU_HALDAJA() {
		super();
	}   
	  
	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}   
	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}
	public VAEOSA getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(VAEOSA param) {
	    this.vAEOSA = param;
	}
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
   
}
