package com.brianlukonsolo.hashing;

import com.brianlukonsolo.common.BytesToStringConverter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashSha256 {
    public String calculateSha256DigestValue(String textInput) throws NoSuchAlgorithmException {
        BytesToStringConverter bytesToStringConverter = new BytesToStringConverter();
        MessageDigest sha256Digest = MessageDigest.getInstance("sha-256");
        sha256Digest.update(textInput.getBytes());
        byte[] digestAsBytes = sha256Digest.digest();

        return bytesToStringConverter.convertBytesToString(digestAsBytes);
    }

}
