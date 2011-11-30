package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;

import java.util.Date;
import java.util.Set;
import ee.itcollege.T25Piirivalve.entities.PIIRIPUNKTI_ORG_YKSUS;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@Size(min = 1, max = 60)
	@NotNull
	private String nimetus;
	@Digits(integer = 4, fraction = 5)
	private Double GPS_Longtitude;
	@Digits(integer = 4, fraction = 5)
	private Double GPS_Latitude;
	@Digits(integer = 4, fraction = 2)
	private Double korgus_merepinnast;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;	
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
	
	public String getKood() {
		return kood;
	}
	public void setKood(String kood) {
		this.kood = kood;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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
