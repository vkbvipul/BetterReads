package com.BetterReads.connection;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "datastax.astra")
//@Configuration
public class DataStaxAstraProperties {

	//@Value("${datastax.astra.secure-connect-bundle}")
	private File secureConnectBundle;

	/**
	 * @return the secureConnectBundle
	 */
	public File getSecureConnectBundle() {
		return secureConnectBundle;
	}

	/**
	 * @param secureConnectBundle the secureConnectBundle to set
	 */
	public void setSecureConnectBundle(File secureConnectBundle) {
		this.secureConnectBundle = secureConnectBundle;
	}
	
}
