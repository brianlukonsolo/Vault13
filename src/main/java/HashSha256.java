import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashSha256 {
    public String calculateSha256DigestValue(String textInput) throws NoSuchAlgorithmException {
        MessageDigest sha256Digest = MessageDigest.getInstance("sha-256");
        sha256Digest.update(textInput.getBytes());
        byte[] digestAsBytes = sha256Digest.digest();
        StringBuilder byteToString = new StringBuilder();
        for(Byte singleByte : digestAsBytes){
            byteToString.append(String.format("%02x", singleByte));
        }

        return byteToString.toString();
    }

}
