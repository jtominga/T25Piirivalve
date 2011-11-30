package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.VAHTKOND_PIIRILOIGUL;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vahtkond_piiriloiguls", formBackingObject = VAHTKOND_PIIRILOIGUL.class)
@RequestMapping("/vahtkond_piiriloiguls")
@Controller
public class VAHTKOND_PIIRILOIGULController {
}
