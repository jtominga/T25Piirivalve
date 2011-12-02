package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.OBJEKTI_SEADUS_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;
/**
 * Entity implementation class for Entity: OBJEKT_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKT_INTSIDENDIS extends BaseEntity implements Serializable {

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
	private INTSIDENT iNTSIDENT;
	@ManyToOne
	private OBJEKT oBJEKT;
	@OneToMany(mappedBy = "oBJEKT_INTSIDENDIS")
	private Collection<OBJEKTI_SEADUS_INTSIDENDIS> oBJEKTI_SEADUS_INTSIDENDIS;

	public OBJEKT_INTSIDENDIS() {
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
	public OBJEKT getOBJEKT() {
	    return oBJEKT;
	}
	public void setOBJEKT(OBJEKT param) {
	    this.oBJEKT = param;
	}
	public Collection<OBJEKTI_SEADUS_INTSIDENDIS> getOBJEKTI_SEADUS_INTSIDENDIS() {
	    return oBJEKTI_SEADUS_INTSIDENDIS;
	}
	public void setOBJEKTI_SEADUS_INTSIDENDIS(Collection<OBJEKTI_SEADUS_INTSIDENDIS> param) {
	    this.oBJEKTI_SEADUS_INTSIDENDIS = param;
	}
   
}
