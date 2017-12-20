package com.adventofcode.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * Maciej Sowula
 * 20.12.2017
 **/
public class Solution
{
    public static int first(int[][] input)
    {
        List<Integer> differences = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < input.length; i++)
        {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < input[i].length; j++)
            {
                if (input[i][j] < min)
                    min = input[i][j];
                if (input[i][j] > max)
                    max = input[i][j];
            }
            differences.add(max-min);
        }

        for (int num : differences)
            result += num;

        return result;
    }

    public static int second(int[][] input)
    {
        List<Integer> rowNumbers = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input[i].length-1; j++)
            {
                for (int k = j+1; k < input[i].length; k++)
                {
                    if (input[i][j] % input[i][k] == 0)
                        rowNumbers.add(input[i][j] / input[i][k]);
                    if (input[i][k] % input[i][j] == 0)
                        rowNumbers.add(input[i][k] / input[i][j]);
                }
            }
        }
        for (int x : rowNumbers)
            result += x;

        return result;
    }
}
