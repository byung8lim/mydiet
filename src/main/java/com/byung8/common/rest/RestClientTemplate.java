package com.byung8.common.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestClientTemplate extends RestTemplate {
	private int connectionTimeout;	
	private int readTimeout;
	
	public RestClientTemplate(int connectionTimeout, int readTimeout) {
		this.connectionTimeout = connectionTimeout;
		this.readTimeout = readTimeout;
        if (getRequestFactory() instanceof SimpleClientHttpRequestFactory) {
        	if (log.isDebugEnabled()) {
        		log.debug("HTTP", "HttpUrlConnection is used");
        	}
            ((SimpleClientHttpRequestFactory) getRequestFactory()).setConnectTimeout(connectionTimeout);
            ((SimpleClientHttpRequestFactory) getRequestFactory()).setReadTimeout(readTimeout);
        } else if (getRequestFactory() instanceof HttpComponentsClientHttpRequestFactory) {
        	if (log.isDebugEnabled()) {
            	log.debug("HTTP", "HttpClient is used");
        	}
            ((HttpComponentsClientHttpRequestFactory) getRequestFactory()).setReadTimeout(connectionTimeout);
            ((HttpComponentsClientHttpRequestFactory) getRequestFactory()).setConnectTimeout(readTimeout);
        }
	}
}
