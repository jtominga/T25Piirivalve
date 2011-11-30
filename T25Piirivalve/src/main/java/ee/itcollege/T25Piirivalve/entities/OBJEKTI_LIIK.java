package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OBJEKTI_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKTI_LIIK extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long objekti_liik_ID;
	private static final long serialVersionUID = 1L;

	public OBJEKTI_LIIK() {
		super();
	}   
	public Long getObjekti_liik_ID() {
		return this.objekti_liik_ID;
	}

	public void setObjekti_liik_ID(Long objekti_liik_ID) {
		this.objekti_liik_ID = objekti_liik_ID;
	}
   
}
