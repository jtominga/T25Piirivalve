// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.T25Piirivalve.entities;

import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import java.lang.Long;
import java.util.List;

privileged aspect INTSIDENDI_LIIK_Roo_Entity {
    
    public static INTSIDENDI_LIIK INTSIDENDI_LIIK.findINTSIDENDI_LIIK(Long id) {
        if (id == null) return null;
        return entityManager().find(INTSIDENDI_LIIK.class, id);
    }
}
