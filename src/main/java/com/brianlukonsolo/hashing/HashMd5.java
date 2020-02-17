package com.brianlukonsolo.hashing;

import com.brianlukonsolo.common.BytesToStringConverter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMd5 {
    public String calculateMd5DigestValue(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        BytesToStringConverter bytesToStringConverter = new BytesToStringConverter();
        MessageDigest md5Digest = MessageDigest.getInstance("md5");
        md5Digest.update(text.getBytes());
        byte[] digestAsBytes = md5Digest.digest();

        return bytesToStringConverter.convertBytesToString(digestAsBytes);

    }
}
