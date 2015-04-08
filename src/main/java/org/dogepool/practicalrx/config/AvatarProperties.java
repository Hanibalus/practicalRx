package org.dogepool.practicalrx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@ConfigurationProperties("avatar")
@Component
public class AvatarProperties {

	@NestedConfigurationProperty
	private final Api api = new Api("127.0.0.1", 8071, "avatar");

	public Api getApi() {
		return api;
	}
}
