package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND_INTSIDENDIS;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR;
import javax.persistence.ManyToOne;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;

/**
 * Entity implementation class for Entity: PIRIVALVUR_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVUR_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_intsidendis_ID;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;
	@ManyToOne
	private INTSIDENT iNTSIDENT;

	public PIIRIVALVUR_INTSIDENDIS() {
		super();
	}   
	public Long getPiirivalvur_intsidendis_ID() {
		return this.piirivalvur_intsidendis_ID;
	}

	public void setPiirivalvur_intsidendis_ID(Long piirivalvur_intsidendis_ID) {
		this.piirivalvur_intsidendis_ID = piirivalvur_intsidendis_ID;
	}
	public VAHTKOND_INTSIDENDIS getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}
	public void setVAHTKOND_INTSIDENDIS(VAHTKOND_INTSIDENDIS param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
   
}
