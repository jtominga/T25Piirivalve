package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;
import javax.persistence.ManyToOne;

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
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private INTSIDENT iNTSIDENT;
	@ManyToOne
	private VAHTKOND vAHTKOND;

	public VAHTKOND_INTSIDENDIS() {
		super();
	}   
	public Long getVahtkod_intsidendis_ID() {
		return this.vahtkod_intsidendis_ID;
	}

	public void setVahtkod_intsidendis_ID(Long vahtkod_intsidendis_ID) {
		this.vahtkod_intsidendis_ID = vahtkod_intsidendis_ID;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}
	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}
   
}
