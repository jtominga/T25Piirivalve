package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.AMET_PIIRIPUNKTIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "amet_piiripunktiss", formBackingObject = AMET_PIIRIPUNKTIS.class)
@RequestMapping("/amet_piiripunktiss")
@Controller
public class AMET_PIIRIPUNKTISController {
}
