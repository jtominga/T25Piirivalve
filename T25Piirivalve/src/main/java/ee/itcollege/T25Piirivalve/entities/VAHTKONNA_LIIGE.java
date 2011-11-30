package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: VAHTKONNA_LIIGE
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKONNA_LIIGE extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkonna_liige_ID;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private VAHTKOND vAHTKOND;
	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;

	public VAHTKONNA_LIIGE() {
		super();
	}   
	public Long getVahtkonna_liige_ID() {
		return this.vahtkonna_liige_ID;
	}

	public void setVahtkonna_liige_ID(Long vahtkonna_liige_ID) {
		this.vahtkonna_liige_ID = vahtkonna_liige_ID;
	}
	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}
	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}
   
}
