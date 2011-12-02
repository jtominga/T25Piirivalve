// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR;
import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_VAEOSAS;
import ee.itcollege.T25Piirivalve.entities.VAEOSA;
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

privileged aspect PIIRIVALVUR_VAEOSASController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String PIIRIVALVUR_VAEOSASController.create(@Valid PIIRIVALVUR_VAEOSAS PIIRIVALVUR_VAEOSAS, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("PIIRIVALVUR_VAEOSAS", PIIRIVALVUR_VAEOSAS);
            addDateTimeFormatPatterns(uiModel);
            return "piirivalvur_vaeosass/create";
        }
        uiModel.asMap().clear();
        PIIRIVALVUR_VAEOSAS.persist();
        return "redirect:/piirivalvur_vaeosass/" + encodeUrlPathSegment(PIIRIVALVUR_VAEOSAS.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String PIIRIVALVUR_VAEOSASController.createForm(Model uiModel) {
        uiModel.addAttribute("PIIRIVALVUR_VAEOSAS", new PIIRIVALVUR_VAEOSAS());
        addDateTimeFormatPatterns(uiModel);
        return "piirivalvur_vaeosass/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String PIIRIVALVUR_VAEOSASController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("piirivalvur_vaeosas", PIIRIVALVUR_VAEOSAS.findPIIRIVALVUR_VAEOSAS(id));
        uiModel.addAttribute("itemId", id);
        return "piirivalvur_vaeosass/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String PIIRIVALVUR_VAEOSASController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("piirivalvur_vaeosass", PIIRIVALVUR_VAEOSAS.findPIIRIVALVUR_VAEOSASEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) PIIRIVALVUR_VAEOSAS.countPIIRIVALVUR_VAEOSASs() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("piirivalvur_vaeosass", PIIRIVALVUR_VAEOSAS.findAllPIIRIVALVUR_VAEOSASs());
        }
        addDateTimeFormatPatterns(uiModel);
        return "piirivalvur_vaeosass/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String PIIRIVALVUR_VAEOSASController.update(@Valid PIIRIVALVUR_VAEOSAS PIIRIVALVUR_VAEOSAS, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("PIIRIVALVUR_VAEOSAS", PIIRIVALVUR_VAEOSAS);
            addDateTimeFormatPatterns(uiModel);
            return "piirivalvur_vaeosass/update";
        }
        uiModel.asMap().clear();
        PIIRIVALVUR_VAEOSAS.merge();
        return "redirect:/piirivalvur_vaeosass/" + encodeUrlPathSegment(PIIRIVALVUR_VAEOSAS.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String PIIRIVALVUR_VAEOSASController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("PIIRIVALVUR_VAEOSAS", PIIRIVALVUR_VAEOSAS.findPIIRIVALVUR_VAEOSAS(id));
        addDateTimeFormatPatterns(uiModel);
        return "piirivalvur_vaeosass/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String PIIRIVALVUR_VAEOSASController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        PIIRIVALVUR_VAEOSAS.findPIIRIVALVUR_VAEOSAS(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/piirivalvur_vaeosass";
    }
    
    @ModelAttribute("piirivalvurs")
    public Collection<PIIRIVALVUR> PIIRIVALVUR_VAEOSASController.populatePIIRIVALVURS() {
        return PIIRIVALVUR.findAllPIIRIVALVURS();
    }
    
    @ModelAttribute("piirivalvur_vaeosass")
    public Collection<PIIRIVALVUR_VAEOSAS> PIIRIVALVUR_VAEOSASController.populatePIIRIVALVUR_VAEOSASs() {
        return PIIRIVALVUR_VAEOSAS.findAllPIIRIVALVUR_VAEOSASs();
    }
    
    @ModelAttribute("vaeosas")
    public Collection<VAEOSA> PIIRIVALVUR_VAEOSASController.populateVAEOSAS() {
        return VAEOSA.findAllVAEOSAS();
    }
    
    void PIIRIVALVUR_VAEOSASController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("PIIRIVALVUR_VAEOSAS_alates_date_format", "dd.MM.yyyy");
        uiModel.addAttribute("PIIRIVALVUR_VAEOSAS_kuni_date_format", "dd.MM.yyyy");
    }
    
    String PIIRIVALVUR_VAEOSASController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
