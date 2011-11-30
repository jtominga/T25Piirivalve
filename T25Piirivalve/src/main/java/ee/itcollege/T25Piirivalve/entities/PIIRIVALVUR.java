package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

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
	@Size(min = 1, max = 20)
	@NotNull
	private String isikukood;
	@Size(min = 1, max = 25)
	@NotNull
	private String eesnimed;
	@Size(min = 1, max = 35)
	@NotNull
	private String perekonnanimi;
	@Size(min = 1, max = 20)
	@NotNull
	private String soduri_kood;
	@NotNull
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
	public String getSoduri_kood() {
		return soduri_kood;
	}
	public void setSoduri_kood(String soduri_kood) {
		this.soduri_kood = soduri_kood;
	}
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}
   
}
