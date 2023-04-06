package org.abhi.worldtime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeOtherClass {
    @Qualifier("baseService1")
    private final IBase baseServiceXyz;

    public void method1(){
        baseServiceXyz.method1();
    }
}
