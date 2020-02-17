import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMd5 {

    public String calculateMd5DigestValue(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5Digest = MessageDigest.getInstance("md5");
        md5Digest.update(text.getBytes());
        byte[] digestAsBytes = md5Digest.digest();
        StringBuilder byteToString = new StringBuilder();
        for(Byte singleByte : digestAsBytes){
            byteToString.append(String.format("%02x", singleByte));
        }

        return byteToString.toString();
    }
}
