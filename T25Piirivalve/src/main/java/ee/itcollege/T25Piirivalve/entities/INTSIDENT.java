package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;
import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: INTSIDENT
 *
 */
@Entity
@RooToString
@RooEntity

public class INTSIDENT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long intsident_ID;
	private Date toimumise_algus;
	private Date toimumise_lopp;
	private Double GPS_Latitude;
	private Double GPS_Longtitude;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRILOIK pIIRILOIK;
	@ManyToOne
	private INTSIDENDI_LIIK iNTSIDENDI_LIIK;

	public INTSIDENT() {
		super();
	}   
	public Long getIntsident_ID() {
		return this.intsident_ID;
	}

	public void setIntsident_ID(Long intsident_ID) {
		this.intsident_ID = intsident_ID;
	}   
	
	
	public Date getToimumise_algus() {
		return this.toimumise_algus;
	}

	public void setToimumise_algus(Date toimumise_algus) {
		this.toimumise_algus = toimumise_algus;
	}   
	public Date getToimumise_lopp() {
		return this.toimumise_lopp;
	}

	public void setToimumise_lopp(Date toimumise_lopp) {
		this.toimumise_lopp = toimumise_lopp;
	}   
	
	public Double getGPS_Latitude() {
		return this.GPS_Latitude;
	}

	public void setGPS_Latitude(Double GPS_Latitude) {
		this.GPS_Latitude = GPS_Latitude;
	}   
	public Double getGPS_Longtitude() {
		return this.GPS_Longtitude;
	}

	public void setGPS_Longtitude(Double GPS_Longtitude) {
		this.GPS_Longtitude = GPS_Longtitude;
	}
	public PIIRILOIK getPIIRILOIK() {
	    return pIIRILOIK;
	}
	public void setPIIRILOIK(PIIRILOIK param) {
	    this.pIIRILOIK = param;
	}
	public INTSIDENDI_LIIK getINTSIDENDI_LIIK() {
	    return iNTSIDENDI_LIIK;
	}
	public void setINTSIDENDI_LIIK(INTSIDENDI_LIIK param) {
	    this.iNTSIDENDI_LIIK = param;
	}
   
}
