package com.adventofcode.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Maciej Sowula
 * 20.12.2017
 **/
public class Solution
{
    public static int first(String input)
    {
        int result = 0;
        List<Integer> found = new ArrayList<>();

        for (int i = 0; i < input.length() - 1; i++)
        {
            if (input.charAt(i) == input.charAt(i+1))
                found.add(Character.getNumericValue(input.charAt(i)));
        }

        if (input.charAt(0) == input.charAt(input.length() - 1))
            found.add(Character.getNumericValue(input.charAt(0)));

        for (int number : found)
        {
            result += number;
        }
        return result;
    }

    public static int second(String input)
    {
        int result = 0;
        int step = input.length()/2;
        List<Integer> found = new ArrayList<>();

        for (int i = 0; i < step; i++)
        {
            if (input.charAt(i) == input.charAt(i+step)) {
                found.add(Character.getNumericValue(input.charAt(i)));
                found.add(Character.getNumericValue(input.charAt(i+step)));
            }
        }
        for (int number : found)
        {
            result += number;
        }
        return result;
    }
}
