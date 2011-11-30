package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: PIIRIVALVUR_VAEOSAS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIVALVUR_VAEOSAS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_vaeosas_ID;
	private Double koormus;
	private static final long serialVersionUID = 1L;

	public PIIRIVALVUR_VAEOSAS() {
		super();
	}   
	public Long getPiirivalvur_vaeosas_ID() {
		return this.piirivalvur_vaeosas_ID;
	}

	public void setPiirivalvur_vaeosas_ID(Long piirivalvur_vaeosas_ID) {
		this.piirivalvur_vaeosas_ID = piirivalvur_vaeosas_ID;
	}   
	public Double getKoormus() {
		return this.koormus;
	}

	public void setKoormus(Double koormus) {
		this.koormus = koormus;
	}
   
}
