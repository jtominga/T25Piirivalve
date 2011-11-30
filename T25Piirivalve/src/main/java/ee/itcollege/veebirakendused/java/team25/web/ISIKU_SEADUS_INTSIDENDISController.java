package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.ISIKU_SEADUS_INTSIDENDIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "isiku_seadus_intsidendiss", formBackingObject = ISIKU_SEADUS_INTSIDENDIS.class)
@RequestMapping("/isiku_seadus_intsidendiss")
@Controller
public class ISIKU_SEADUS_INTSIDENDISController {
}
