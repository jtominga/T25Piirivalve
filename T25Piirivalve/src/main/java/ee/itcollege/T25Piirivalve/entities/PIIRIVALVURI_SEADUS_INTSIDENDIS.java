package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.SEADUS;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_INTSIDENDIS;

/**
 * Entity implementation class for Entity: OBJEKTI_SEADUS_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVURI_SEADUS_INTSIDENDIS extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvuri_seadus_intsidendis_ID;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	@NotNull
	private String kirjeldus;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private SEADUS sEADUS;
	@ManyToOne
	private PIIRIVALVUR_INTSIDENDIS pIIRIVALVUR_INTSIDENDIS;

	public PIIRIVALVURI_SEADUS_INTSIDENDIS() {
		super();
	}   
	public Long getPiirivalvuri_seadus_intsidendis_ID() {
		return piirivalvuri_seadus_intsidendis_ID;
	}
	public void setPiirivalvuri_seadus_intsidendis_ID(
			Long piirivalvuri_seadus_intsidendis_ID) {
		this.piirivalvuri_seadus_intsidendis_ID = piirivalvuri_seadus_intsidendis_ID;
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
	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public SEADUS getSEADUS() {
	    return sEADUS;
	}
	public void setSEADUS(SEADUS param) {
	    this.sEADUS = param;
	}
	public PIIRIVALVUR_INTSIDENDIS getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(PIIRIVALVUR_INTSIDENDIS param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
   
}
