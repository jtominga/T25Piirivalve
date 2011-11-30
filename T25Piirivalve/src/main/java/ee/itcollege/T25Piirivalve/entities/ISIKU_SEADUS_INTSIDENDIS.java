package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.SEADUS;
import ee.itcollege.T25Piirivalve.entities.ISIK_INTSIDENDIS;

/**
 * Entity implementation class for Entity: OBJEKTI_SEADUS_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class ISIKU_SEADUS_INTSIDENDIS extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long isiku_seadus_intsidendis_ID;
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
	private ISIK_INTSIDENDIS iSIK_INTSIDENDIS;

	public ISIKU_SEADUS_INTSIDENDIS() {
		super();
	}   
	public Long getIsiku_seadus_intsidendis_ID() {
		return isiku_seadus_intsidendis_ID;
	}
	public void setIsiku_seadus_intsidendis_ID(
			Long isiku_seadus_intsidendis_ID) {
		this.isiku_seadus_intsidendis_ID = isiku_seadus_intsidendis_ID;
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
	public ISIK_INTSIDENDIS getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}
	public void setISIK_INTSIDENDIS(ISIK_INTSIDENDIS param) {
	    this.iSIK_INTSIDENDIS = param;
	}
   
}
