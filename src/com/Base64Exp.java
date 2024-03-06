package com;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class Base64Exp {
	public static void main(String args[]) {
		try {

			// Encode using basic encoder
			String base64encodedString = Base64.getEncoder().encodeToString(
					"TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic) :"
					+ base64encodedString);

			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(
					base64encodedString);

			System.out.println("Original String: "
					+ new String(base64decodedBytes, "utf-8"));
			base64encodedString = Base64.getUrlEncoder().encodeToString(
					"http://www.tutorialspoint.com/java8/java8_base64.htm".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL) :"
					+ base64encodedString);

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < 10; ++i) {
				stringBuilder.append(UUID.randomUUID().toString());
			}

			byte[] mimeBytes = new String("5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437").toString().getBytes("utf-8");
			
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(
					mimeBytes);
			System.out.println("Base64 Encoded String (MIME) :"
					+ mimeEncodedString);

		} catch (UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}