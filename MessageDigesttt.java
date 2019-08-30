import java.util.Scanner;
import java.security.MessageDigest;

public class MessageDigesttt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] digest = md.digest();
            for(byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

/*
 *  MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT,
 *  however, the security of MD5 has been severely compromised, most infamously by the Flame malware in.
 *   The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".
 */
