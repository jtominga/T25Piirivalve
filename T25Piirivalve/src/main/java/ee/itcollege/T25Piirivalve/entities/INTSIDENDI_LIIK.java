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
        	List<INTSIDENDI_LIIK> temp = entityManager().createQuery("SELECT o FROM INTSIDENDI_LIIK o WHERE suletud > curdate()", INTSIDENDI_LIIK.class).getResultList();

        	return temp;
	}
	
    public static long countINTSIDENDI_LIIKs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM INTSIDENDI_LIIK o WHERE suletud > curdate()", Long.class).getSingleResult();
    }
    
    public static List<INTSIDENDI_LIIK> findINTSIDENDI_LIIKEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM INTSIDENDI_LIIK o WHERE suletud > curdate()", INTSIDENDI_LIIK.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
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
