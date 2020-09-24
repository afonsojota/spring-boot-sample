package com.afonso.dojo.utils;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith({MockitoExtension.class, SpringExtension.class})
public class DojoUtilsTest {

    @Autowired
    DojoUtils utils;

    @Test
    public void should_reverse_char_array(){
        char[][] input = {{'X','Y','Z'},{'A','B','C'}};
        char[][] expected = {{'Z','Y','A'},{'C','B','A'}};

        char[][] result = utils.reverseArray(input);

        Assertions.assertArrayEquals(result[0],expected[0]);
        Assertions.assertArrayEquals(result[1],expected[1]);
    }

    @Test
    public void should_transpose_char_array(){
        char[][] input = {{'A','C','E'},{'B','D','F'}};
        char[][] expected = {{'A','B'},{'C','D'},{'E','F'}};

        char[][] result = utils.transposeCharArray(input);

        Assertions.assertArrayEquals(result[0],expected[0]);
        Assertions.assertArrayEquals(result[1],expected[1]);
        Assertions.assertArrayEquals(result[2],expected[2]);
    }

    @Test
    public void should_convert_string_to_char_array(){
        String[] input = {"ABCD","EFGH"};
        char[][] expected = {{'A','B','C','D'},{'E','F','G','H'}};

        char[][] result = utils.stringToMatrixCharArray(input);

        Assertions.assertArrayEquals(result[0],expected[0]);
        Assertions.assertArrayEquals(result[1],expected[1]);
    }

}
