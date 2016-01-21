package com.rem.RSA;

import android.util.Log;

/**
 * Created by Anastasiya on 1/18/2016.
 */
public class TestProgram {
    static  String TestTag = "TestTag";
    GenerationTextAndKey generationTextAndKey = new GenerationTextAndKey();
    int randomTextSize = (int)(8 + (Math.random() * 60 - 8));
    int randomKeySize = (int)(2 + (Math.random() * 10 - 2));
    String stringText = generationTextAndKey.generationText(randomTextSize);
    String stringKey = generationTextAndKey.generationText(randomKeySize);
    String messageEncrypted;
    String messageDecipher;

    public void cycleTest (int iteration) {
        Log.v(TestTag, "Text size " + randomTextSize + " Key size " + randomKeySize);
        int iIteration = iteration;
        for (int i = 0; i < iIteration; i++) {
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
