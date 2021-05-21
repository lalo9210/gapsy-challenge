package com.gapsy.challenge.productoapirest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.gapsy.challenge.productoapirest.api.v1.resource.ProductoResource;

@Component
@ApplicationPath("/challenge")
public class JerseyConfiguration extends ResourceConfig {
	public JerseyConfiguration() {
		register(ProductoResource.class);
	}
}