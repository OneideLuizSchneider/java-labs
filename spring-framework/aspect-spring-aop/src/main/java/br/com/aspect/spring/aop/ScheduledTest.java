/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aspect.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author oneide.schneider
 */
@Component
public class ScheduledTest {

    @Autowired
    TestService ts;

    @Scheduled(fixedDelay = 1000)
    void start() throws InterruptedException {
        ts.execute();
    }
}
