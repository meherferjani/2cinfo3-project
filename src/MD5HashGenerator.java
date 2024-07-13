import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.Scanner;

public class MD5HashGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        String md5Hash = generateMD5(password);
        System.out.println("MD5 Hash of the password: " + md5Hash);
    }

    public static String generateMD5(String input) {
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // Add password bytes to digest
            md.update(input.getBytes());
            // Get the hash's bytes
            byte[] bytes = md.digest();
            // Convert bytes to hexadecimal format
            BigInteger bigInteger = new BigInteger(1, bytes);
            // Convert the hexadecimal string to a string
            String md5Hash = bigInteger.toString(16);
            // Pad with leading zeros to make sure the hash has 32 characters
            while (md5Hash.length() < 32) {
                md5Hash = "0" + md5Hash;
            }
            return md5Hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
