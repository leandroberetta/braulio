package io.veicot;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("braulio-camel-context")
public class BraulioRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file://opt/braulio/downloads?include={{extensionsRegex}}")
                .log("Moving ${header.CamelFileName}")
                .setHeader("dest", simple("file://opt/braulio/downloads/${file:ext}"))
                .recipientList(simple("${header.dest}"));
    }
}
