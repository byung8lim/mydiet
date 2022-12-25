package com.byung8.mydiet.service;

import lombok.extern.slf4j.Slf4j;

//@Service("fitnessService")
@Slf4j
public class FitnessServiceImpl implements FitnessService {

	public String getServiceInfo() throws Exception {
		if (log.isInfoEnabled()) {
			log.info("getServiceInfo");
		}
		return "Nurisystem's Fitness Service";
	}
}
