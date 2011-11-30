package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.ISIK_INTSIDENDIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "isik_intsidendiss", formBackingObject = ISIK_INTSIDENDIS.class)
@RequestMapping("/isik_intsidendiss")
@Controller
public class ISIK_INTSIDENDISController {
}
