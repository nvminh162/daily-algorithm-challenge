package playground.cryptography;

// https://www.topcoder.com/thrive/articles/caesar-cipher-in-java-encryption-and-decryption
public class CaesarCipher {
    /* public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int ii = 0; ii < message.length(); ii++) {
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int ii = 0; ii < cipherText.length(); ii++) {
            int charPosition = alpha.indexOf(cipherText.charAt(ii));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = alpha.length() + keyVal;
            }
            char replaceVal = alpha.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    } */

    private static String encryptMessage(String msg, int k) {
        String result = "";
        for (int i = 0; i < msg.length(); i++)
            result += encryptChar(msg.charAt(i), k);
        return result;
    }

    private static char encryptChar(char c, int k) {
        if (Character.isLetter(c))
            return (char) ('A' + (c - 'A' + k) % 26); // 'A'=65
        else
            return c;
    }

    public static void main(String[] args) {
        String plainText = "ACTIONS";
        String encode = "DFWLRQV";
        int s = 3;

        System.out.println("----------------");
        System.out.println("encrypt: ");
        System.out.println("Text  : " + plainText);
        System.out.println("Cipher: " + encryptMessage(plainText, s));
        System.out.println("----------------");
        System.out.println("decrypt: ");
        System.out.println("Text : " + encode);
        System.out.println("Cipher: " + encryptMessage(encode, 26 - s));
    }
}