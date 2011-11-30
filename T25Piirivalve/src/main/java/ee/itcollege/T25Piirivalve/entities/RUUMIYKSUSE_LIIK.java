package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: RUUMIYKSUSE_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class RUUMIYKSUSE_LIIK implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ruumiyksuse_liik_ID;
	private static final long serialVersionUID = 1L;

	public RUUMIYKSUSE_LIIK() {
		super();
	}   
	public Long getRuumiyksuse_liik_ID() {
		return this.ruumiyksuse_liik_ID;
	}

	public void setRuumiyksuse_liik_ID(Long ruumiyksuse_liik_ID) {
		this.ruumiyksuse_liik_ID = ruumiyksuse_liik_ID;
	}
   
}
