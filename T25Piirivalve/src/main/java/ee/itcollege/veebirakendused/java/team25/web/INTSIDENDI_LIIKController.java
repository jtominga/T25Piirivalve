package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.INTSIDENDI_LIIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "intsidendi_liiks", formBackingObject = INTSIDENDI_LIIK.class)
@RequestMapping("/intsidendi_liiks")
@Controller
public class INTSIDENDI_LIIKController {
}
