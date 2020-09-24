package com.afonso.dojo.dao;

import com.afonso.dojo.entity.NinjaEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */
public class NinjaRowMapper implements RowMapper<NinjaEntity> {

    @Override
    public NinjaEntity mapRow(ResultSet rs, int i) throws SQLException {
        NinjaEntity ninja = new NinjaEntity();
        ninja.setNinja(rs.getString("NINJA"));
        return ninja;
    }

}
