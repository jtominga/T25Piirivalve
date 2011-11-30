package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: VAEOSA
 *
 */
@Entity
@RooToString
@RooEntity

public class VAEOSA extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vaeosa_ID;  
	private static final long serialVersionUID = 1L;

	public VAEOSA() {
		super();
	}
	
	public Long getVaeosa_ID() {
		return this.vaeosa_ID;
	}

	public void setRiigi_admin_yksus_ID(Long riigi_admin_yksus_ID) {
		this.riigi_admin_yksus_ID = riigi_admin_yksus_ID;
	} 
	
   
}
