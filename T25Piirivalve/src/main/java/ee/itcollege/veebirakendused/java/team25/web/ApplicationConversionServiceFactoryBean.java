package ee.itcollege.veebirakendused.java.team25.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.RooConversionService;

import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.PIIRILOIK;
import ee.itcollege.T25Piirivalve.entities.VAEOSA;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND;
import ee.itcollege.T25Piirivalve.entities.VAHTKOND_INTSIDENDIS;

/**
 * A central place to register application converters and formatters. 
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		// Register application converters and formatters
		registry.addConverter(new INTSIDENTConverter());
		registry.addConverter(new VAEOSAConverter());
		registry.addConverter(new VAHTKOND_INTSIDENDISConverter());
		registry.addConverter(new PIIRILOIKConverter());
		registry.addConverter(new VAHTKONDConverter());		
	}
	
    static class INTSIDENTConverter implements Converter<INTSIDENT, String> {
        public String convert(INTSIDENT iNTSIDENT) {
            return new StringBuilder().append(iNTSIDENT.getKood()).append(" ").append(iNTSIDENT.getNimetus()).toString();
        }
        
    }
    
    static class VAEOSAConverter implements Converter<VAEOSA, String> {
        public String convert(VAEOSA vAEOSA) {
            return new StringBuilder().append(vAEOSA.getKood()).append(" ").append(vAEOSA.getNimetus()).toString();
        }
        
    }
    
    static class VAHTKOND_INTSIDENDISConverter implements Converter<VAHTKOND_INTSIDENDIS, String> {
        public String convert(VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS) {
            return new StringBuilder().append(vAHTKOND_INTSIDENDIS.getVAHTKOND().getNimetus()).append(" ").append(vAHTKOND_INTSIDENDIS.getKirjeldus()).toString();
        }
        
    }
    
    static class PIIRILOIKConverter implements Converter<PIIRILOIK, String> {
        public String convert(PIIRILOIK pIIRILOIK) {
            return new StringBuilder().append(pIIRILOIK.getKood()).append(" ").append(pIIRILOIK.getNimetus()).toString();
        }
        
    }
    
    static class VAHTKONDConverter implements Converter<VAHTKOND, String> {
        public String convert(VAHTKOND vAHTKOND) {
            return new StringBuilder().append(vAHTKOND.getKood()).append(" ").append(vAHTKOND.getNimetus()).toString();
        }
        
    }
}
