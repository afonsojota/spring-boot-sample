package com.afonso.dojo.utils;

/**
 * Created by Afonso Jardim
 * User: afonso.jota@gmail.com
 * LinkedIn: linkedin.com/in/afonsojardim/
 * Date: 07/02/2020
 */

import org.springframework.stereotype.Component;

@Component
public class DojoUtils {

    public char[][] stringToMatrixCharArray(String[] clan){
        int my_rows = clan.length;
        int my_cols = clan[0].length();
        char result[][]=new char[my_rows][my_cols];

        for(int i=0; i < my_rows; i++){
            char[]clanAsArray = clan[i].toCharArray();
            for (int j=0; j < clanAsArray.length; j++) {
                char clanChar = clanAsArray[j];
                result[i][j] = clanChar;
            }

        }

        return result;
    }

    public String[] extractColumns(char[][] charArray) {
        char[][] transposed = transposeCharArray(charArray);

        String[] result = new String[transposed.length];

        for(int r = 0; r < transposed.length; r++) {
            StringBuilder sb = new StringBuilder();
            for(int c = 0; c < transposed[0].length; c++) {
                sb.append(transposed[r][c]);
            }
            result[r] = sb.toString();
        }

        return result;
    }

    public char[][] transposeCharArray(char[][] data) {
        int maxLen = 0;
        for (char[] row : data)
            if (row.length > maxLen)
                maxLen = row.length;
        char[][] result = new char[maxLen][data.length];
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                result[j][i] = data[i][j];
        return result;
    }

    public char[][] reverseArray(char[][] my_array){
        int my_rows = my_array.length;
        int my_cols = my_array[0].length;
        char result[][]=new char[my_rows][my_cols];
        for(int i = 0; i < my_rows; i++) {
            for(int j = my_cols-1; j >= 0; j--) {
                result[i][my_cols-1-j] = my_array[i][j];
            }
        }

        return result;
    }

}
