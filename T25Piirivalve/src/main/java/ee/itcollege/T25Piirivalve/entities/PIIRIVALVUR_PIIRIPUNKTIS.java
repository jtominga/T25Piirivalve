package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.AMET_PIIRIPUNKTIS;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: PIIRIVALVUR_PIIRIPUNKTIS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVUR_PIIRIPUNKTIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_piiripunktis_ID;
	private Double koormus;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private AMET_PIIRIPUNKTIS aMET_PIIRIPUNKTIS;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;

	public PIIRIVALVUR_PIIRIPUNKTIS() {
		super();
	}   
	public Long getPiirivalvur_piiripunktis_ID() {
		return this.piirivalvur_piiripunktis_ID;
	}

	public void setPiirivalvur_piiripunktis_ID(Long piirivalvur_piiripunktis_ID) {
		this.piirivalvur_piiripunktis_ID = piirivalvur_piiripunktis_ID;
	}   
	public Double getKoormus() {
		return this.koormus;
	}

	public void setKoormus(Double koormus) {
		this.koormus = koormus;
	}
	public AMET_PIIRIPUNKTIS getAMET_PIIRIPUNKTIS() {
	    return aMET_PIIRIPUNKTIS;
	}
	public void setAMET_PIIRIPUNKTIS(AMET_PIIRIPUNKTIS param) {
	    this.aMET_PIIRIPUNKTIS = param;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
   
}
