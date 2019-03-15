package com.dlut.jpa.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.core.config.EnumTranslationConfiguration;
import org.springframework.data.rest.core.config.MetadataConfiguration;
import org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

//@Configuration
public class MyRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration
{
    public MyRepositoryRestMvcConfiguration(ApplicationContext context, ObjectFactory<ConversionService> conversionService)
    {
        super(context, conversionService);
    }


}
