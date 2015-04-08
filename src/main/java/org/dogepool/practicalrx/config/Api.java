package org.dogepool.practicalrx.config;

public class Api {

	/**
	 * IP address of the service
	 */
	private String ip;

	/**
	 * Port of the service.
	 */
	private int port;

	/**
	 * Context path of the service.
	 */
	private String path = "/";

	public Api(String ip, int port, String path) {
		this.ip = ip;
		this.port = port;
		this.path = path;
	}

	public Api(String ip, int port) {
		this(ip, port, null);
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getBaseUrl() {
		return String.format("http://%s:%d/%s", getIp(), getPort(), getPath());
	}

}
