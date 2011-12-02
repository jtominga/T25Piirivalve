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
import ee.itcollege.T25Piirivalve.entities.PIIRIPUNKT;

/**
 * Entity implementation class for Entity: AMET_PIIRIPUNKTIS
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET_PIIRIPUNKTIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long amet_piiripunktis_id;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private AMET aMET;
	@OneToMany(mappedBy = "aMET_PIIRIPUNKTIS")
	private Set<PIIRIVALVUR_PIIRIPUNKTIS> pIIRIVALVUR_PIIRIPUNKTIS;
	@ManyToOne
	private PIIRIPUNKT pIIRIPUNKT;

	public AMET_PIIRIPUNKTIS() {
		super();
	}   
	public Long getAmet_piiripunktis_id() {
		return this.amet_piiripunktis_id;
	}

	public void setAmet_piiripunktis_id(Long amet_piiripunktis_id) {
		this.amet_piiripunktis_id = amet_piiripunktis_id;
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
	public AMET getAMET() {
	    return aMET;
	}
	public void setAMET(AMET param) {
	    this.aMET = param;
	}
	public Set<PIIRIVALVUR_PIIRIPUNKTIS> getPIIRIVALVUR_PIIRIPUNKTIS() {
	    return pIIRIVALVUR_PIIRIPUNKTIS;
	}
	public void setPIIRIVALVUR_PIIRIPUNKTIS(Set<PIIRIVALVUR_PIIRIPUNKTIS> param) {
	    this.pIIRIVALVUR_PIIRIPUNKTIS = param;
	}
	public PIIRIPUNKT getPIIRIPUNKT() {
	    return pIIRIPUNKT;
	}
	public void setPIIRIPUNKT(PIIRIPUNKT param) {
	    this.pIIRIPUNKT = param;
	}
   
}
