package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PIIRILOIK
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRILOIK extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiriloik_ID;
	private Double GPS_Longtitude;
	private Double GPS_Latitude;
	private static final long serialVersionUID = 1L;

	public PIIRILOIK() {
		super();
	}   
	public Long getPiiriloik_ID() {
		return this.piiriloik_ID;
	}

	public void setPiiriloik_ID(Long piiriloik_ID) {
		this.piiriloik_ID = piiriloik_ID;
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
	
	public void setGPS_koordinaadid(String GPS_koordinaadid) {
		this.GPS_koordinaadid = GPS_koordinaadid;
	}
   
}
