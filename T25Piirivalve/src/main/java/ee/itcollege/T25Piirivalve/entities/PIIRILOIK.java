package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;

/**
 * Entity implementation class for Entity: PIIRILOIK
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIK extends BaseEntity implements Serializable {

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
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<PIIRILOIGU_HALDAJA> pIIRILOIGU_HALDAJA;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<VAHTKOND_PIIRILOIGUL> vAHTKOND_PIIRILOIGUL;
	@OneToMany(mappedBy = "pIIRILOIK")
	private Collection<INTSIDENT> iNTSIDENT;
	public PIIRILOIK() {
		super();
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
	public Collection<PIIRILOIGU_HALDAJA> getPIIRILOIGU_HALDAJA() {
	    return pIIRILOIGU_HALDAJA;
	}
	public void setPIIRILOIGU_HALDAJA(Collection<PIIRILOIGU_HALDAJA> param) {
	    this.pIIRILOIGU_HALDAJA = param;
	}
	public Collection<VAHTKOND_PIIRILOIGUL> getVAHTKOND_PIIRILOIGUL() {
	    return vAHTKOND_PIIRILOIGUL;
	}
	public void setVAHTKOND_PIIRILOIGUL(Collection<VAHTKOND_PIIRILOIGUL> param) {
	    this.vAHTKOND_PIIRILOIGUL = param;
	}
	public Collection<INTSIDENT> getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(Collection<INTSIDENT> param) {
	    this.iNTSIDENT = param;
	}
   
}
