package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: AMET_VAEOSAS
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET_VAEOSAS implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long amet_vaeosas_ID;
	private static final long serialVersionUID = 1L;

	public AMET_VAEOSAS() {
		super();
	}   
	public Long getAmet_vaeosas_ID() {
		return this.amet_vaeosas_ID;
	}

	public void setAmet_vaeosas_ID(Long amet_vaeosas_ID) {
		this.amet_vaeosas_ID = amet_vaeosas_ID;
	}
   
}
