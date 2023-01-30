package Hash;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		scan.close();

		MessageDigest md5 = MessageDigest.getInstance("SHA-256");
		byte[] input = message.getBytes();
		byte[] hash = md5.digest(input);
		StringBuilder hexString = new StringBuilder();

		for (byte b : hash) {
			String hex = Integer.toHexString(0xff & b);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		System.out.println(hexString.toString());
	}

}