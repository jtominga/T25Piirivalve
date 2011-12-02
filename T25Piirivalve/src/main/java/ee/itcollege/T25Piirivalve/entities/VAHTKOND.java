package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: VAHTKOND
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND extends BaseEntity implements Serializable {

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
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKOND_PIIRILOIGUL> vAHTKOND_PIIRILOIGUL;
	@OneToMany(mappedBy = "vAHTKOND")
	private Collection<VAHTKOND_INTSIDENDIS> vAHTKOND_INTSIDENDIS;
	public VAHTKOND() {
		super();
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
	public Collection<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Collection<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Collection<VAHTKOND_PIIRILOIGUL> getVAHTKOND_PIIRILOIGUL() {
	    return vAHTKOND_PIIRILOIGUL;
	}
	public void setVAHTKOND_PIIRILOIGUL(Collection<VAHTKOND_PIIRILOIGUL> param) {
	    this.vAHTKOND_PIIRILOIGUL = param;
	}
	public Collection<VAHTKOND_INTSIDENDIS> getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(Collection<VAHTKOND_INTSIDENDIS> param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	
   
}
