package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: PIIRIRIKKUJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIRIKKUJA extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiririkkuja_ID;
	private String isikukood;
	private String eesnimi;
	private String perenimi;
	private char sugu;
	private Date synniaeg;
	private static final long serialVersionUID = 1L;

	public PIIRIRIKKUJA() {
		super();
	}   
	public Long getPiiririkkuja_ID() {
		return this.piiririkkuja_ID;
	}

	public void setPiiririkkuja_ID(Long piiririkkuja_ID) {
		this.piiririkkuja_ID = piiririkkuja_ID;
	}   
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}   
	public String getPerenimi() {
		return this.perenimi;
	}

	public void setPerenimi(String perenimi) {
		this.perenimi = perenimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}   
	public Date getSynniaeg() {
		return this.synniaeg;
	}

	public void setSynniaeg(Date synniaeg) {
		this.synniaeg = synniaeg;
	}
   
}
