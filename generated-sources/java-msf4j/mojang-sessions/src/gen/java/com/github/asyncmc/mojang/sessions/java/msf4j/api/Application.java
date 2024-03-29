package com.github.asyncmc.mojang.sessions.java.msf4j.server;

import org.wso2.msf4j.MicroservicesRunner;

/**
 * Application entry point.
 *
 * @since 1.0.0-SNAPSHOT
 */
public class Application {
    public static void main(String[] args) {

System.out.println("starting Micro Services");
//Before you run service replace .deploy(new ()) with your actual service class like .deploy(new ApisAPI()) then it will start that service.
//If you have multiple service classes add them in comma separated manner.
//Ex: .deploy(new PetApi())
        new MicroservicesRunner()
                .deploy(new PetApi())
                .start();
    }
}
