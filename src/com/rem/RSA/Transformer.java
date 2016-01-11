package com.rem.RSA;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 07.01.2016.
 */
public class Transformer {
    public static ArrayList<Integer> transformMessageToInt(String message)
    {
        ArrayList<Integer> messageInteger = new ArrayList<Integer>();
        char [] charactersArray = message.toCharArray();

        for (int i = 0; i < charactersArray.length; i++) {
            messageInteger.add((int) charactersArray[i]);
        }

        return messageInteger;
    }

    public static String transformArrayToString (ArrayList<Integer> arrayList)
    {

        StringBuilder builder = new StringBuilder(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            builder.append((char) arrayList.get(i).intValue());
        }

        return builder.toString();
    }
}
