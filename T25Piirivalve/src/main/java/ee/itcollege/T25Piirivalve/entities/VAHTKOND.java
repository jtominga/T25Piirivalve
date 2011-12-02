package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRIPUNKT;
import javax.persistence.ManyToOne;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND_PIIRILOIGUL;
import java.util.Set;
import javax.persistence.OneToMany;
import ee.itcollege.T25Piirivalve.entities.VAHTKONNA_LIIGE;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND_INTSIDENDIS;

/**
 * Entity implementation class for Entity: VAHTKOND
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkond_ID;
	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@Size(min = 1, max = 60)
	@NotNull
	private String nimetus;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;
	@OneToMany(mappedBy = "vAHTKOND")
	private Set<VAHTKOND_PIIRILOIGUL> vAHTKOND_PIIRILOIGUL;
	@OneToMany(mappedBy = "vAHTKOND")
	private Set<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "vAHTKOND")
	private Set<VAHTKOND_INTSIDENDIS> vAHTKOND_INTSIDENDIS;
	public VAHTKOND() {
		super();
	}   
	public Long getVahtkond_ID() {
		return this.vahtkond_ID;
	}

	public void setVahtkond_ID(Long vahtkond_ID) {
		this.vahtkond_ID = vahtkond_ID;
	}
	public String getKood() {
		return kood;
	}
	public void setKood(String kood) {
		this.kood = kood;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
	public Set<VAHTKOND_PIIRILOIGUL> getVAHTKOND_PIIRILOIGUL() {
	    return vAHTKOND_PIIRILOIGUL;
	}
	public void setVAHTKOND_PIIRILOIGUL(Set<VAHTKOND_PIIRILOIGUL> param) {
	    this.vAHTKOND_PIIRILOIGUL = param;
	}
	public Set<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Set<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Set<VAHTKOND_INTSIDENDIS> getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(Set<VAHTKOND_INTSIDENDIS> param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	
   
}
