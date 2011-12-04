package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

@RooWebScaffold(path = "intsidents", formBackingObject = INTSIDENT.class)
@RequestMapping("/intsidents")
@Controller
public class INTSIDENTController {
	@RequestMapping(method = RequestMethod.POST)
    public String create(@Valid INTSIDENT INTSIDENT, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("INTSIDENT", INTSIDENT);
            addDateTimeFormatPatterns(uiModel);
            return "intsidents/create";
        }
        uiModel.asMap().clear();
        INTSIDENT.persist();
        return "redirect:/intsidents/" + encodeUrlPathSegment(INTSIDENT.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(Model uiModel) {
        uiModel.addAttribute("INTSIDENT", new INTSIDENT());
        addDateTimeFormatPatterns(uiModel);
        List dependencies = new ArrayList();
        if (PIIRILOIK.countPIIRILOIKS() == 0) {
            dependencies.add(new String[]{"piiriloik", "piiriloiks"});
        }
        if (INTSIDENDI_LIIK.countINTSIDENDI_LIIKs() == 0) {
            dependencies.add(new String[]{"intsidendi_liik", "intsidendi_liiks"});
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "intsidents/create";
    }
}
