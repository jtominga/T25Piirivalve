package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.PIIRILOIGU_HALDAJA;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piiriloigu_haldajas", formBackingObject = PIIRILOIGU_HALDAJA.class)
@RequestMapping("/piiriloigu_haldajas")
@Controller
public class PIIRILOIGU_HALDAJAController {
}
