package ee.itcollege.veebirakendused.java.team25.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.ISIK_INTSIDENDIS;
import ee.itcollege.T25Piirivalve.entities.PIIRIRIKKUJA;

@RooWebScaffold(path = "isik_intsidendiss", formBackingObject = ISIK_INTSIDENDIS.class)
@RequestMapping("/isik_intsidendiss")
@Controller
public class ISIK_INTSIDENDISController {
	
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(Model uiModel) {
        uiModel.addAttribute("ISIK_INTSIDENDIS", new ISIK_INTSIDENDIS());
        addDateTimeFormatPatterns(uiModel);
        List<String[]> dependencies = new ArrayList<String[]>();
        if (INTSIDENT.countINTSIDENTS() == 0) {
            dependencies.add(new String[]{"intsident", "intsidents"});
        }
        if (PIIRIRIKKUJA.countPIIRIRIKKUJAS() == 0) {
            dependencies.add(new String[]{"piiririkkuja", "piiririkkujas"});
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "isik_intsidendiss/create";
    }
    	
}
