package com.afonso.dojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

@Component
public class NinjaDTO {

    @JsonProperty("ninja_dojo")
    private String[] clan;

    public String[] getClan() {
        return clan;
    }

    public void setClan(String[] clan) {
        this.clan = clan;
    }

}
