package org.icet.hms.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class config {
    @Bean
    public ModelMapper getmodelMapper()
    {
        return new ModelMapper();
    }
}