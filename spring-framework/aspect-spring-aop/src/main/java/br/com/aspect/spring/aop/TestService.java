/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aspect.spring.aop;

import br.com.aspect.spring.aop.annotation.LogGenerate;
import org.springframework.stereotype.Component;

/**
 *
 * @author oneide.schneider
 */
@Component
public class TestService {

    @LogGenerate
    public void execute() throws InterruptedException {
        Thread.sleep(1000);
    }
}
