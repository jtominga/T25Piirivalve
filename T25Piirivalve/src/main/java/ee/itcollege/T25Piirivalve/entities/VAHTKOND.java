package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: VAHTKOND
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkond_ID;
	private static final long serialVersionUID = 1L;

	public VAHTKOND() {
		super();
	}   
	public Long getVahtkond_ID() {
		return this.vahtkond_ID;
	}

	public void setVahtkond_ID(Long vahtkond_ID) {
		this.vahtkond_ID = vahtkond_ID;
	}
	
   
}
