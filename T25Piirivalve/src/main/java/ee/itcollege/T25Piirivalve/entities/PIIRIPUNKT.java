package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

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
   
}
