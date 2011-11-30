package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.VAEOSA;
/**
 * Entity implementation class for Entity: PIIRILOIGU_HALDAJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIGU_HALDAJA extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiriloigu_haldaja_ID;
	private Date alates;
	private Date kuni;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;
	@ManyToOne
	private VAEOSA vAEOSA;
	public PIIRILOIGU_HALDAJA() {
		super();
	}   
	public Long getPiiriloigu_haldaja_ID() {
		return this.piiriloigu_haldaja_ID;
	}

	public void setPiiriloigu_haldaja_ID(Long piiriloigu_haldaja_ID) {
		this.piiriloigu_haldaja_ID = piiriloigu_haldaja_ID;
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
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
	public VAEOSA getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(VAEOSA param) {
	    this.vAEOSA = param;
	}
   
}
