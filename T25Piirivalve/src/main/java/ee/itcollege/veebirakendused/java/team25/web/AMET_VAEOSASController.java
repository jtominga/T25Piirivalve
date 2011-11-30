package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.AMET_VAEOSAS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "amet_vaeosass", formBackingObject = AMET_VAEOSAS.class)
@RequestMapping("/amet_vaeosass")
@Controller
public class AMET_VAEOSASController {
}
