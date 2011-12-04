package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: INTSIDENDI_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class INTSIDENDI_LIIK extends BaseEntity implements Serializable  {

	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@Size(min = 1, max = 60)
	@NotNull
	private String nimetus;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "iNTSIDENDI_LIIK")
	private Collection<INTSIDENT> iNTSIDENT;
	public INTSIDENDI_LIIK() {
		super();
	}
	
	public static List<INTSIDENDI_LIIK> findAllINTSIDENDI_LIIKs() {
        List<INTSIDENDI_LIIK> temp = entityManager().createQuery("SELECT o FROM INTSIDENDI_LIIK o", INTSIDENDI_LIIK.class).getResultList();
		
        Calendar cal = Calendar.getInstance();
		cal.set(9999, 11, 31);
		Date end = cal.getTime();
		
        for (INTSIDENDI_LIIK a : temp) {
			if (a.getSuletud() != end) {
				temp.remove(a);
			}
		}
        return temp;
    }
	
	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}
	
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}
	public Collection<INTSIDENT> getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(Collection<INTSIDENT> param) {
	    this.iNTSIDENT = param;
	}
   
}
