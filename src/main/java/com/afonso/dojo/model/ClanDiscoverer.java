package com.afonso.dojo.model;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

import com.afonso.dojo.utils.DojoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ClanDiscoverer {

    Logger log = LoggerFactory.getLogger(ClanDiscoverer.class);

    @Autowired
    private DojoUtils utils;

    public boolean isNinja(String[] clan) {
        return clanValidation(clan);
    }

    public boolean clanValidation(String[] clan){
        Pattern pattern = Pattern.compile("^[XYZ]+");

        for (String name : clan)
        {
            Matcher matcher = pattern.matcher(name);
            if(!matcher.matches()){
                log.warn("Invalid CLAN!");
                throw new IllegalArgumentException("It's not a Ninja!");
            }
        }

        return true;
    }

}
