package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

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
