package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: RIIGI_ADMIN_YKSUS
 *
 */
@Entity
@RooToString
@RooEntity

public class RIIGI_ADMIN_YKSUS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long riigi_admin_yksus_ID;  
	private static final long serialVersionUID = 1L;

	public RIIGI_ADMIN_YKSUS() {
		super();
	}   
	public Long getRiigi_admin_yksus_ID() {
		return this.riigi_admin_yksus_ID;
	}

	public void setRiigi_admin_yksus_ID(Long riigi_admin_yksus_ID) {
		this.riigi_admin_yksus_ID = riigi_admin_yksus_ID;
	} 
   
}
