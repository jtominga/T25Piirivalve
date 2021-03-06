// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.ISIK_INTSIDENDIS;
import ee.itcollege.T25Piirivalve.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND_INTSIDENDIS;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect INTSIDENTController_Roo_Controller {
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String INTSIDENTController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("intsident", INTSIDENT.findINTSIDENT(id));
        uiModel.addAttribute("itemId", id);
        return "intsidents/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String INTSIDENTController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("intsidents", INTSIDENT.findINTSIDENTEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) INTSIDENT.countINTSIDENTS() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("intsidents", INTSIDENT.findAllINTSIDENTS());
        }
        addDateTimeFormatPatterns(uiModel);
        return "intsidents/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String INTSIDENTController.update(@Valid INTSIDENT INTSIDENT, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("INTSIDENT", INTSIDENT);
            addDateTimeFormatPatterns(uiModel);
            return "intsidents/update";
        }
        uiModel.asMap().clear();
        INTSIDENT.merge();
        return "redirect:/intsidents/" + encodeUrlPathSegment(INTSIDENT.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String INTSIDENTController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("INTSIDENT", INTSIDENT.findINTSIDENT(id));
        addDateTimeFormatPatterns(uiModel);
        return "intsidents/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String INTSIDENTController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        INTSIDENT.findINTSIDENT(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/intsidents";
    }
    
    @ModelAttribute("intsidendi_liiks")
    public Collection<INTSIDENDI_LIIK> INTSIDENTController.populateINTSIDENDI_LIIKs() {
        return INTSIDENDI_LIIK.findAllINTSIDENDI_LIIKs();
    }
    
    @ModelAttribute("intsidents")
    public Collection<INTSIDENT> INTSIDENTController.populateINTSIDENTS() {
        return INTSIDENT.findAllINTSIDENTS();
    }
    
    @ModelAttribute("isik_intsidendiss")
    public Collection<ISIK_INTSIDENDIS> INTSIDENTController.populateISIK_INTSIDENDISs() {
        return ISIK_INTSIDENDIS.findAllISIK_INTSIDENDISs();
    }
    
    @ModelAttribute("objekt_intsidendiss")
    public Collection<OBJEKT_INTSIDENDIS> INTSIDENTController.populateOBJEKT_INTSIDENDISs() {
        return OBJEKT_INTSIDENDIS.findAllOBJEKT_INTSIDENDISs();
    }
    
    @ModelAttribute("piiriloiks")
    public Collection<PIIRILOIK> INTSIDENTController.populatePIIRILOIKS() {
        return PIIRILOIK.findAllPIIRILOIKS();
    }
    
    @ModelAttribute("piirivalvur_intsidendiss")
    public Collection<PIIRIVALVUR_INTSIDENDIS> INTSIDENTController.populatePIIRIVALVUR_INTSIDENDISs() {
        return PIIRIVALVUR_INTSIDENDIS.findAllPIIRIVALVUR_INTSIDENDISs();
    }
    
    @ModelAttribute("vahtkond_intsidendiss")
    public Collection<VAHTKOND_INTSIDENDIS> INTSIDENTController.populateVAHTKOND_INTSIDENDISs() {
        return VAHTKOND_INTSIDENDIS.findAllVAHTKOND_INTSIDENDISs();
    }
    
    void INTSIDENTController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("INTSIDENT_toimumise_algus_date_format", "dd.MM.yyyy");
        uiModel.addAttribute("INTSIDENT_toimumise_lopp_date_format", "dd.MM.yyyy");
    }
    
    String INTSIDENTController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
