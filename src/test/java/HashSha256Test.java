import com.brianlukonsolo.hashing.HashSha256;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

@Log4j
public class HashSha256Test {
    @Test
    public void itShouldReturnAnMd5HashStringWhenGivenAnInputString() throws NoSuchAlgorithmException {
        String textInput = "inputStringToBeProcessed";
        String expectedHash = "ae0a019b4cf26c7b8dff0be80f4ec6cbfa4866c660846dfb03f887482ca220d8";

        HashSha256 sha256Hash = new HashSha256();
        String actual = sha256Hash.calculateSha256DigestValue(textInput);
        log.info("Actual: " + actual);
        log.info("Expected: " + expectedHash);

        assert (actual.equals(expectedHash));
    }

}
