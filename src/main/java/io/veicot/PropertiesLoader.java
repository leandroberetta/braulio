package io.veicot;

import org.apache.camel.component.properties.PropertiesComponent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class PropertiesLoader {

    @Produces
    @ApplicationScoped
    @Named("properties")
    PropertiesComponent propertiesComponent() {
        PropertiesComponent component = new PropertiesComponent();

        component.setInitialProperties(System.getProperties());

        return component;
    }
}
