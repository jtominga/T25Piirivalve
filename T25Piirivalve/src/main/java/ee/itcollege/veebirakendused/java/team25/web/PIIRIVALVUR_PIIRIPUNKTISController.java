package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_PIIRIPUNKTIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvur_piiripunktiss", formBackingObject = PIIRIVALVUR_PIIRIPUNKTIS.class)
@RequestMapping("/piirivalvur_piiripunktiss")
@Controller
public class PIIRIVALVUR_PIIRIPUNKTISController {
}
