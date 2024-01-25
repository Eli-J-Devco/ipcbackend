/********************************************************
* Copyright 2020-2021 NEXT WAVE ENERGY MONITORING INC.
* All rights reserved.
* 
*********************************************************/
package com.nwm.api.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableBatchProcessing
@EnableScheduling
public class BatchConfig {
	
	/**
	 * @description batch job get weather
	 * @author long.pham
	 * @since 2021-02-17
	 */
//	@Scheduled(cron = "* * * * * *")
//	@Scheduled(cron = "0 */1 * * * *")
//	@Scheduled(cron = "0 */1 * * * *")
//	public void startBatchJobSolarOpenWeather() throws Exception {
//		BatchJob job =new BatchJob(); 
////		job.runCronJobSolarOpenWeather();
//	}
	
	
	

}
