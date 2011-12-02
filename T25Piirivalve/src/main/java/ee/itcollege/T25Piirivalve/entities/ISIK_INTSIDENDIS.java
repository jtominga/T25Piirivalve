package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.ISIKU_SEADUS_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: ISIK_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class ISIK_INTSIDENDIS extends BaseEntity implements Serializable {

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
	@NotNull
	private INTSIDENT iNTSIDENT;
	@ManyToOne
	@NotNull
	private PIIRIRIKKUJA pIIRIRIKKUJA;
	@OneToMany(mappedBy = "iSIK_INTSIDENDIS")
	private Collection<ISIKU_SEADUS_INTSIDENDIS> iSIKU_SEADUS_INTSIDENDIS;

	public ISIK_INTSIDENDIS() {
		super();
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
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
	public PIIRIRIKKUJA getPIIRIRIKKUJA() {
	    return pIIRIRIKKUJA;
	}
	public void setPIIRIRIKKUJA(PIIRIRIKKUJA param) {
	    this.pIIRIRIKKUJA = param;
	}
	public Collection<ISIKU_SEADUS_INTSIDENDIS> getISIKU_SEADUS_INTSIDENDIS() {
	    return iSIKU_SEADUS_INTSIDENDIS;
	}
	public void setISIKU_SEADUS_INTSIDENDIS(Collection<ISIKU_SEADUS_INTSIDENDIS> param) {
	    this.iSIKU_SEADUS_INTSIDENDIS = param;
	}
   
}
