package com.rem.RSA;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 07.01.2016.
 */
public class Encryption {
    private String key;
    private int decimalKey;

    public Encryption (String key)
    {
        this.key = key;
        this.transformKeyToDecimal();
    }

    private void transformKeyToDecimal()
    {
        ArrayList<Integer> arrayList = Transformer.transformMessageToInt(this.key);
        int summ = 0;

        for (Integer val : arrayList) {
            summ += val;
        }

        decimalKey = (summ % arrayList.size()) + 1;
    }

    public String encryptMessage (String message)
    {
        ArrayList<Integer> messageArray = Transformer.transformMessageToInt(message);
        ArrayList<Integer> encryptedArray = new ArrayList<Integer>();

        for (int i = 0; i < messageArray.size(); i++) {
            int rowArray = messageArray.get(i);
            encryptedArray.add(rowArray + decimalKey + (i % decimalKey));
        }

        return Transformer.transformArrayToString(encryptedArray);
    }

    public String decipherMessage (String message)
    {
        ArrayList<Integer> encryptedArray = Transformer.transformMessageToInt(message);
        ArrayList<Integer> decipherArray = new ArrayList<Integer>();

        for (int i = 0; i < encryptedArray.size(); i++) {
            int rowArray = encryptedArray.get(i);
            decipherArray.add(rowArray - decimalKey - (i % decimalKey));
        }

        return Transformer.transformArrayToString(decipherArray);
    }
}
