// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.T25Piirivalve.entities;

import ee.itcollege.T25Piirivalve.entities.PIIRILOIGU_HALDAJA;
import java.lang.Long;
import java.util.List;

privileged aspect PIIRILOIGU_HALDAJA_Roo_Entity {
    
    public static long PIIRILOIGU_HALDAJA.countPIIRILOIGU_HALDAJAs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PIIRILOIGU_HALDAJA o", Long.class).getSingleResult();
    }
    
    public static List<PIIRILOIGU_HALDAJA> PIIRILOIGU_HALDAJA.findAllPIIRILOIGU_HALDAJAs() {
        return entityManager().createQuery("SELECT o FROM PIIRILOIGU_HALDAJA o", PIIRILOIGU_HALDAJA.class).getResultList();
    }
    
    public static PIIRILOIGU_HALDAJA PIIRILOIGU_HALDAJA.findPIIRILOIGU_HALDAJA(Long id) {
        if (id == null) return null;
        return entityManager().find(PIIRILOIGU_HALDAJA.class, id);
    }
    
    public static List<PIIRILOIGU_HALDAJA> PIIRILOIGU_HALDAJA.findPIIRILOIGU_HALDAJAEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PIIRILOIGU_HALDAJA o", PIIRILOIGU_HALDAJA.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
