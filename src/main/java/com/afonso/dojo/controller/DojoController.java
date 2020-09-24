package com.afonso.dojo.controller;

import com.afonso.dojo.dto.NinjaDTO;
import com.afonso.dojo.model.ClanDiscoverer;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

@RestController
public class DojoController {

    Logger log = LoggerFactory.getLogger(DojoController.class);

    @Autowired
    private ClanDiscoverer discoverer;

    @PostMapping(value="/ninja", consumes= MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "It's a Ninja!"), @ApiResponse(code = 403, message = "It's not a Ninja")})
    public void ninja(@RequestBody NinjaDTO ninja, HttpServletResponse response) {
        boolean isNinja = false;

        log.info("checking person");

        try {
            isNinja = discoverer.isNinja(ninja.getClan());
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
        }

        int status = isNinja ? HttpServletResponse.SC_OK : HttpServletResponse.SC_FORBIDDEN;
        response.setStatus(status);
    }

}
