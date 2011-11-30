package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.PIIRIVALVUR_INTSIDENDIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvur_intsidendiss", formBackingObject = PIIRIVALVUR_INTSIDENDIS.class)
@RequestMapping("/piirivalvur_intsidendiss")
@Controller
public class PIIRIVALVUR_INTSIDENDISController {
}
