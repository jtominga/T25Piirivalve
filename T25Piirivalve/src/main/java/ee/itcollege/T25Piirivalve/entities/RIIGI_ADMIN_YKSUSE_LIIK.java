package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RIIGI_ADMIN_YKSUSE_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class RIIGI_ADMIN_YKSUSE_LIIK extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long riigi_admin_yksuse_liik_id;
	private static final long serialVersionUID = 1L;

	public RIIGI_ADMIN_YKSUSE_LIIK() {
		super();
	}   
	public Long getRiigi_admin_yksuse_liik_id() {
		return this.riigi_admin_yksuse_liik_id;
	}

	public void setRiigi_admin_yksuse_liik_id(Long riigi_admin_yksuse_liik_id) {
		this.riigi_admin_yksuse_liik_id = riigi_admin_yksuse_liik_id;
	}   
	
   
}
