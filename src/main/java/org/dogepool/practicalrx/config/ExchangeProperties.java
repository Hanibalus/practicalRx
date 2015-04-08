package org.dogepool.practicalrx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@ConfigurationProperties("exchange")
@Component
public class ExchangeProperties {

	private final Free free = new Free();

	public Free getFree() {
		return free;
	}

	static class Free {

		@NestedConfigurationProperty
		private final Api api = new Api("127.0.0.1", 8073);

		public Api getApi() {
			return api;
		}
	}
}
