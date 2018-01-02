/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autoresidence.residence.application;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Lab-2
 */
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
        public MyApplication() {
        packages("br.com.autoresidence.residence.controllers");
    }
}
