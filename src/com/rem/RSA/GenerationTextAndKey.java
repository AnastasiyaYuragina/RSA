package com.rem.RSA;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 1/18/2016.
 */
public class GenerationTextAndKey {
    final int minRange = (int) ' ';
    final int maxRange = (int) '~';

    public String generationText (int sizeText) {
        int size = sizeText;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            arrayList.add((int)(minRange + (Math.random() * maxRange - minRange)));
        }

        StringBuilder builder = new StringBuilder(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            builder.append((char) arrayList.get(i).intValue());
        }

        return builder.toString();
    }

    public String generationKey (int sizeKey) {
        int size = sizeKey;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            arrayList.add((int)(minRange + (Math.random() * maxRange - minRange)));
        }

        StringBuilder builder = new StringBuilder(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            builder.append((char) arrayList.get(i).intValue());
        }
        return builder.toString();
    }
}
