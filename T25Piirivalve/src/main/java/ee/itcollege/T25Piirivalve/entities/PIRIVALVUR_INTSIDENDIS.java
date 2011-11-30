package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: PIRIVALVUR_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIRIVALVUR_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piirivalvur_intsidendis_ID;
	private static final long serialVersionUID = 1L;

	public PIRIVALVUR_INTSIDENDIS() {
		super();
	}   
	public Long getPiirivalvur_intsidendis_ID() {
		return this.piirivalvur_intsidendis_ID;
	}

	public void setPiirivalvur_intsidendis_ID(Long piirivalvur_intsidendis_ID) {
		this.piirivalvur_intsidendis_ID = piirivalvur_intsidendis_ID;
	}
   
}
