package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_VAEOSAS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvur_vaeosass", formBackingObject = PIIRIVALVUR_VAEOSAS.class)
@RequestMapping("/piirivalvur_vaeosass")
@Controller
public class PIIRIVALVUR_VAEOSASController {
}
