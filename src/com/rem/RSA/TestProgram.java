package com.rem.RSA;

import android.util.Log;

/**
 * Created by Anastasiya on 1/18/2016.
 */
public class TestProgram {
    static  String TestTag = "TestTag";
    GenerationTextAndKey generationTextAndKey = new GenerationTextAndKey();
    int randomTextSize;
    int randomKeySize;
    String stringText;
    String stringKey;
    String messageEncrypted;
    String messageDecipher;

    public void cycleTest (int iteration) {

        int iIteration = iteration;
        for (int i = 1; i <= iIteration; i++) {
            randomTextSize = (int)(8 + (Math.random() * 52));
            randomKeySize = (int)(2 + (Math.random() * 8));
            stringText = generationTextAndKey.generationText(randomTextSize);
            stringKey = generationTextAndKey.generationText(randomKeySize);

            Log.v(TestTag, "iteration = " + i);
            Log.v(TestTag, "Text size " + randomTextSize + " Key size " + randomKeySize);

            testEncryption();
        }
    }

    public void testEncryption () {
        Encryption encription = new Encryption(stringKey);
        messageEncrypted = encription.encryptMessage(stringText);
        Log.v(TestTag, "Text " + stringText + " Key " + stringKey + " Encrypted text " + messageEncrypted);
        testDecription();
    }

    public void testDecription () {
        Encryption encription = new Encryption(stringKey);
        messageDecipher = encription.decipherMessage(messageEncrypted);
        if (messageDecipher.equals(stringText)) {
            Log.v(TestTag, "Encrypted text " + messageEncrypted + " Key " + stringKey + " Decripted text " + messageDecipher + " decript text = text");
        } else
        {
            Log.v(TestTag, "Encrypted text " + messageEncrypted + " Key " + stringKey + " Decripted text " + messageDecipher + " decript text != text");
        }

    }

}
