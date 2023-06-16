package hello.proxy.jdkdynamic.common.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class concreteService {
    public void call() {
        log.info("ConcreteService 호출");
    }
}
