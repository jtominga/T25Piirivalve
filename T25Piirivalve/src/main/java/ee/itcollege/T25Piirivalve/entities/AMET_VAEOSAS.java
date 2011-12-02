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
import ee.itcollege.T25Piirivalve.entities.AMET;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_VAEOSAS;
import java.util.Set;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: AMET_VAEOSAS
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET_VAEOSAS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long amet_vaeosas_ID;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private VAEOSA vAEOSA;
	@ManyToOne
	private AMET aMET;
	@OneToMany(mappedBy = "aMET_VAEOSAS")
	private Set<PIIRIVALVUR_VAEOSAS> pIIRIVALVUR_VAEOSAS;
	public AMET_VAEOSAS() {
		super();
	}   
	public Long getAmet_vaeosas_ID() {
		return this.amet_vaeosas_ID;
	}

	public void setAmet_vaeosas_ID(Long amet_vaeosas_ID) {
		this.amet_vaeosas_ID = amet_vaeosas_ID;
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
	public VAEOSA getVAEOSA() {
	    return vAEOSA;
	}
	public void setVAEOSA(VAEOSA param) {
	    this.vAEOSA = param;
	}
	public AMET getAMET() {
	    return aMET;
	}
	public void setAMET(AMET param) {
	    this.aMET = param;
	}
	public Set<PIIRIVALVUR_VAEOSAS> getPIIRIVALVUR_VAEOSAS() {
	    return pIIRIVALVUR_VAEOSAS;
	}
	public void setPIIRIVALVUR_VAEOSAS(Set<PIIRIVALVUR_VAEOSAS> param) {
	    this.pIIRIVALVUR_VAEOSAS = param;
	}
   
}
