package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.OBJEKTI_LIIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "objekti_liiks", formBackingObject = OBJEKTI_LIIK.class)
@RequestMapping("/objekti_liiks")
@Controller
public class OBJEKTI_LIIKController {
}
