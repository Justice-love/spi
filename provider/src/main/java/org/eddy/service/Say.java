package org.eddy.service;

import org.eddy.SayHello;
import org.kohsuke.MetaInfServices;

import java.util.ServiceLoader;

/**
 * Created by eddy on 2017/2/11.
 */
@MetaInfServices
public class Say implements SayHello {

    public String say() {
        return "hello";
    }

    public static void main(String[] args) {
        ServiceLoader<SayHello> services = ServiceLoader.load(SayHello.class);
        for (SayHello sayHello : services) {
            sayHello.say();
        }
    }
}
