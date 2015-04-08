package org.dogepool.practicalrx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("store")
@Component
public class StoreProperties {

	private boolean enableFindAll = true;

	private String[] nodes = new String[]{"127.0.0.1"};

	private String bucket = "default";

	private String bucketPassword;

	public boolean isEnableFindAll() {
		return enableFindAll;
	}

	public void setEnableFindAll(boolean enableFindAll) {
		this.enableFindAll = enableFindAll;
	}

	public String[] getNodes() {
		return nodes;
	}

	public void setNodes(String[] nodes) {
		this.nodes = nodes;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getBucketPassword() {
		return bucketPassword;
	}

	public void setBucketPassword(String bucketPassword) {
		this.bucketPassword = bucketPassword;
	}

}
