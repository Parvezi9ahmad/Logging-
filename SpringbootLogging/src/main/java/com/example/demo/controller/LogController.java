package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	Logger logger = LoggerFactory.getLogger(LogController.class);

	@RequestMapping("/log")
	public String log() {
		logger.info("logger info");
		logger.error("Error message");
		logger.warn("Warn message");
		logger.debug("Debug message");
		logger.trace("Trace message");
		return "Output for this program";
	}
}
