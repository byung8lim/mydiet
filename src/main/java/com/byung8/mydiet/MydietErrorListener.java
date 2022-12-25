package com.byung8.mydiet;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * TacoMetricsCollectorErrorListener ?��?��?��
 *
 */
@Slf4j
public class MydietErrorListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
       if (event.getException() != null) {
    	   event.getApplicationContext().close();    	   
    	   System.exit(-1);
       } 
    }
}
