package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;

/**
 * Entity implementation class for Entity: VAHTKOND_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkod_intsidendis_ID;
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
	private VAHTKOND vAHTKOND;
	@OneToMany(mappedBy = "vAHTKOND_INTSIDENDIS")
	private Set<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;
	@ManyToOne
	private INTSIDENT iNTSIDENT;
	public VAHTKOND_INTSIDENDIS() {
		super();
	}   
	public Long getVahtkod_intsidendis_ID() {
		return this.vahtkod_intsidendis_ID;
	}

	public void setVahtkod_intsidendis_ID(Long vahtkod_intsidendis_ID) {
		this.vahtkod_intsidendis_ID = vahtkod_intsidendis_ID;
	}
	public Date getAlates() {
		return alates;
	}
	public void setAlates(Date alates) {
		this.alates = alates;
	}
	public Date getKuni() {
		return kuni;
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
	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
	public Set<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(Set<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
   
}
