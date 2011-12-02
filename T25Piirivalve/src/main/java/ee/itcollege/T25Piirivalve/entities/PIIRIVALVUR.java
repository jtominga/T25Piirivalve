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
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_VAEOSAS;
import java.util.Set;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_PIIRIPUNKTIS;
import javax.persistence.OneToMany;
import ee.itcollege.T25Piirivalve.entities.VAHTKONNA_LIIGE;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_INTSIDENDIS;

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
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Set<PIIRIVALVUR_VAEOSAS> pIIRIVALVUR_VAEOSAS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Set<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Set<VAHTKONNA_LIIGE> vAHTKONNA_LIIGE;
	@OneToMany(mappedBy = "pIIRIVALVUR")
	private Set<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;

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
	public Set<PIIRIVALVUR_VAEOSAS> getPIIRIVALVUR_VAEOSAS() {
	    return pIIRIVALVUR_VAEOSAS;
	}
	public void setPIIRIVALVUR_VAEOSAS(Set<PIIRIVALVUR_VAEOSAS> param) {
	    this.pIIRIVALVUR_VAEOSAS = param;
	}
	public Set<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS() {
	    return pIIRIVALVUR_PIIRIPUNKTIS;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS(Set<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS = param;
	}
	public Set<VAHTKONNA_LIIGE> getVAHTKONNA_LIIGE() {
	    return vAHTKONNA_LIIGE;
	}
	public void setVAHTKONNA_LIIGE(Set<VAHTKONNA_LIIGE> param) {
	    this.vAHTKONNA_LIIGE = param;
	}
	public Set<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}
	public void setPIIRIVALVUR_INTSIDENDIS(Set<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}
   
}
