// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.T25Piirivalve.entities;

import java.lang.String;

privileged aspect PIIRIVALVUR_INTSIDENDIS_Roo_ToString {
    
    public String PIIRIVALVUR_INTSIDENDIS.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alates: ").append(getAlates()).append(", ");
        sb.append("Avaja: ").append(getAvaja()).append(", ");
        sb.append("Avatud: ").append(getAvatud()).append(", ");
        sb.append("INTSIDENT: ").append(getINTSIDENT()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Kirjeldus: ").append(getKirjeldus()).append(", ");
        sb.append("Kommentaar: ").append(getKommentaar()).append(", ");
        sb.append("Kuni: ").append(getKuni()).append(", ");
        sb.append("Muudetud: ").append(getMuudetud()).append(", ");
        sb.append("Muutja: ").append(getMuutja()).append(", ");
        sb.append("PIIRIVALVUR: ").append(getPIIRIVALVUR()).append(", ");
        sb.append("PIIRIVALVURI_SEADUS_INTSIDENDIS: ").append(getPIIRIVALVURI_SEADUS_INTSIDENDIS() == null ? "null" : getPIIRIVALVURI_SEADUS_INTSIDENDIS().size()).append(", ");
        sb.append("Suletud: ").append(getSuletud()).append(", ");
        sb.append("Sulgeja: ").append(getSulgeja()).append(", ");
        sb.append("VAHTKOND_INTSIDENDIS: ").append(getVAHTKOND_INTSIDENDIS()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
