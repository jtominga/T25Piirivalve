package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: RUUMIYKSUS
 *
 */
@Entity
@RooToString
@RooEntity

public class RUUMIYKSUS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ruumiyksus_ID;
	private static final long serialVersionUID = 1L;

	public RUUMIYKSUS() {
		super();
	}   
	public Long getRuumiyksus_ID() {
		return this.ruumiyksus_ID;
	}

	public void setRuumiyksus_ID(Long ruumiyksus_ID) {
		this.ruumiyksus_ID = ruumiyksus_ID;
	}
   
}
