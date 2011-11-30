package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: RIIGI_ADMINs_YKSUSE_LIIK
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
