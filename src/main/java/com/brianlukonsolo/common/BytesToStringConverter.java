package com.brianlukonsolo.common;

public class BytesToStringConverter {
    public String convertBytesToString(byte[] bytesArray){
        StringBuilder byteToString = new StringBuilder();
        for(Byte singleByte : bytesArray){
            byteToString.append(String.format("%02x", singleByte));
        }

        return byteToString.toString();
    }
}
