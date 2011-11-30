package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PIIRIVALVUR
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVUR extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_ID;
	private String isikukood;
	private String eesnimed;
	private String perekonnanimi;
	private char sugu;
	private static final long serialVersionUID = 1L;

	public PIIRIVALVUR() {
		super();
	}   
	public Long getPiirivalvur_ID() {
		return this.piirivalvur_ID;
	}

	public void setPiirivalvur_ID(Long piirivalvur_ID) {
		this.piirivalvur_ID = piirivalvur_ID;
	}   
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimed() {
		return this.eesnimed;
	}

	public void setEesnimed(String eesnimed) {
		this.eesnimed = eesnimed;
	}   
	public String getPerekonnanimi() {
		return this.perekonnanimi;
	}

	public void setPerekonnanimi(String perekonnanimi) {
		this.perekonnanimi = perekonnanimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}
   
}
