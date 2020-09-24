package com.afonso.dojo.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */
@Component
public class NinjaEntity {

    private String ninja;

    public String getNinja() {
        return ninja;
    }

    public void setNinja(String ninja) {
        this.ninja = ninja;
    }

}
