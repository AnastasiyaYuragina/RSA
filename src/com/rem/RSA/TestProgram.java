package com.rem.RSA;

import android.util.Log;

/**
 * Created by Anastasiya on 1/18/2016.
 */
public class TestProgram {
    static  String TestTag = "TestTag";
    GenerationTextAndKey generationTextAndKey = new GenerationTextAndKey();
    String stringText = generationTextAndKey.generationText(50);
    String stringKey = generationTextAndKey.generationText(10);
    String messageEncrypted;
    String messageDecipher;


    public void testEncryption () {
        Encryption encription = new Encryption(stringKey);
        messageEncrypted = encription.encryptMessage(stringText);
        Log.v(TestTag, "Text " + stringText + " Key" + stringKey + " Encrypted text " + messageEncrypted);
        testDecription();
    }

    public void testDecription () {
        Encryption encription = new Encryption(stringKey);
        messageDecipher = encription.decipherMessage(messageEncrypted);
        if (messageDecipher == stringText) {
            Log.v(TestTag, "Encrypted text " + messageEncrypted + " Key " + stringKey + " Decripted text " + messageDecipher + " decript text = text");
        } else
        {
            Log.v(TestTag, "Encrypted text " + messageEncrypted + " Key " + stringKey + " Decripted text " + messageDecipher + " decript text != text");
        }

    }

}
