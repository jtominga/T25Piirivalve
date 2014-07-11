package ee.itcollege.veebirakendused.java.team25.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;

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
        List<String[]> dependencies = new ArrayList<String[]>();
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
