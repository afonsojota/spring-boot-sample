package com.afonso.dojo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */
@Repository
public class NinjaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertClan(String ninja){
        String insertQuery = "insert into NINJA (clan) values (?)";

        Object[] params = new Object[] {ninja};

        int[] types = new int[] { Types.VARCHAR};
        jdbcTemplate.update(insertQuery, params, types);
    }

}
