package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.OBJEKTI_SEADUS_INTSIDENDIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "objekti_seadus_intsidendiss", formBackingObject = OBJEKTI_SEADUS_INTSIDENDIS.class)
@RequestMapping("/objekti_seadus_intsidendiss")
@Controller
public class OBJEKTI_SEADUS_INTSIDENDISController {
}
