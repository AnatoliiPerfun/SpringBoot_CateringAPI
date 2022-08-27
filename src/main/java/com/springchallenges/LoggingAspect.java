package com.springchallenges;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.springchallenges.CateringJobController.*ById(Long)) && args(id)")
    public Object logObj(ProceedingJoinPoint joinPoint, Long id) throws Throwable {
        logger.info("got request to et job by id = {}", id);
        Object response = joinPoint.proceed();
        logger.info("return response for request: {}", response);
        return response;
    }
}
