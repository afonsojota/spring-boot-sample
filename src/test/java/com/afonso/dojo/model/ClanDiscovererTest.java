package com.afonso.dojo.model;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@SpringBootTest
@ExtendWith({MockitoExtension.class, SpringExtension.class})
public class ClanDiscovererTest {

    @Autowired
    private ClanDiscoverer discoverer;

    private static String[] valid_clan;
    private static String[] invalid_clan;

    @BeforeAll
    public static void populateClans(){
        valid_clan = new String[]{
            "XYZ",
            "YXX"
        };
        invalid_clan = new String[]{
                "XYA",
                "ZYX"
        };
    }

    @Test
    public void should_be_a_valid_clan(){
        boolean clanSample = discoverer.isNinja(valid_clan);
        Assert.isTrue(clanSample,"Invalid Clan!");
    }

    @Test
    public void should_throws_exception_with_invalid_clan(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            discoverer.isNinja(invalid_clan);
        });

        String expectedMessage = "It's not a valid clan!";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

}
