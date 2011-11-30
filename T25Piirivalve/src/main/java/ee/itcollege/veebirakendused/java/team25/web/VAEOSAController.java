package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.VAEOSA;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vaeosas", formBackingObject = VAEOSA.class)
@RequestMapping("/vaeosas")
@Controller
public class VAEOSAController {
}
