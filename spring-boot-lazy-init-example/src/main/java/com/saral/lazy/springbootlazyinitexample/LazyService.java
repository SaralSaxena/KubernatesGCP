package com.saral.lazy.springbootlazyinitexample;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {


    public LazyService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }

    public String hello() {
        return "hello Lazy Saral V1";
    }
}
