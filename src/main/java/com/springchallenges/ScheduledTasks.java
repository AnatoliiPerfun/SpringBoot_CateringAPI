package com.springchallenges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ScheduledTasks {

    final
    CateringJobRepository repository;
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    public ScheduledTasks(CateringJobRepository repository) {
        this.repository = repository;
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void reportOrderStats() {
        List<CateringJob> jobs = repository.findAll();
        logger.info("We have " + jobs.size() + " jobs");
    }
}
