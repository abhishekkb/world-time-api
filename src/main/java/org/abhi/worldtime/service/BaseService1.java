package org.abhi.worldtime.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BaseService1 implements IBase{
    @Override
    public void method1() {
        log.info("yaya");
        System.out.println("yaya");
    }

    @Override
    public void method2() {

    }
}
