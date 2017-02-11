package org.eddy.service;

import org.eddy.SayHello;
import org.kohsuke.MetaInfServices;

/**
 * Created by eddy on 2017/2/11.
 */
@MetaInfServices
public class Say implements SayHello {

    public String say() {
        return "hello";
    }
}
