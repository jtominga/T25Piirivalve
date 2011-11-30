package ee.itcollege.veebirakendused.java.team25.web;

import ee.itcollege.T25Piirivalve.entities.SEADUSE_PUNKT;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "seaduse_punkts", formBackingObject = SEADUSE_PUNKT.class)
@RequestMapping("/seaduse_punkts")
@Controller
public class SEADUSE_PUNKTController {
}
