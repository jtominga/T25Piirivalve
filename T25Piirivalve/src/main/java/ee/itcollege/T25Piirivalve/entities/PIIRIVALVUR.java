package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Collection<PIIRIVALVUR_VAEOSAS> pIIRIVALVUR_VAEOSAS;
	public PIIRIVALVUR() {
		super();
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
	public Collection<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(Collection<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
	public Collection<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Collection<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Collection<PIIRIVALVUR_VAEOSAS> getPIIRIVALVUR_VAEOSAS() {
	    return pIIRIVALVUR_VAEOSAS;
	}
	public void setPIIRIVALVUR_VAEOSAS(Collection<PIIRIVALVUR_VAEOSAS> param) {
	    this.pIIRIVALVUR_VAEOSAS = param;
	}
   
}
