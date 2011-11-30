package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;
import java.util.Set;
import ee.itcollege.T25Piirivalve.entities.PIIRIPUNKTI_ORG_YKSUS;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

/**
 * Entity implementation class for Entity: PIIRIPUNKT
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIPUNKT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiripunkt_ID;
	private Double GPS_Longtitude;
	private Double GPS_Latitude;
	private Double korgus_merepinnast;
	private static final long serialVersionUID = 1L;
	@OneToMany
	@JoinColumn(name = "PIIRIPUNKT_piiripunkt_ID", referencedColumnName = "piiripunkt_ID")
	private Set<VAHTKOND> vAHTKOND;
	@OneToMany
	@JoinColumn(name = "PIIRIPUNKT_piiripunkt_ID", referencedColumnName = "piiripunkt_ID")
	private Set<PIIRIPUNKTI_ORG_YKSUS> pIIRIPUNKTI_ORG_YKSUS;

	public PIIRIPUNKT() {
		super();
	}   
	public Long getPiiripunkt_ID() {
		return this.piiripunkt_ID;
	}

	public void setPiiripunkt_ID(Long piiripunkt_ID) {
		this.piiripunkt_ID = piiripunkt_ID;
	}   
	
	public Double getGPS_Longtitude() {
		return this.GPS_Longtitude;
	}

	public void setGPS_Longtitude(Double GPS_Longtitude) {
		this.GPS_Longtitude = GPS_Longtitude;
	}   
	public Double getGPS_Latitude() {
		return this.GPS_Latitude;
	}

	public void setGPS_Latitude(Double GPS_Latitude) {
		this.GPS_Latitude = GPS_Latitude;
	}   
	public Double getKorgus_merepinnast() {
		return this.korgus_merepinnast;
	}

	public void setKorgus_merepinnast(Double korgus_merepinnast) {
		this.korgus_merepinnast = korgus_merepinnast;
	}
	public Set<VAHTKOND> getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(Set<VAHTKOND> param) {
	    this.vAHTKOND = param;
	}
	public Set<PIIRIPUNKTI_ORG_YKSUS> getPIIRIPUNKTI_ORG_YKSUS() {
	    return pIIRIPUNKTI_ORG_YKSUS;
	}
	public void setPIIRIPUNKTI_ORG_YKSUS(Set<PIIRIPUNKTI_ORG_YKSUS> param) {
	    this.pIIRIPUNKTI_ORG_YKSUS = param;
	}
   
}
