import java.io.*;
import java.security.MessageDigest;

public class ComputeSHA {

	public static String sha1(File file) throws Exception {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
		InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

		byte[] digest = new byte[1024];
		for (int read = 0; (read = inputStream.read(digest)) != -1;) {
			messageDigest.update(digest, 0, read);
		}

		StringBuilder string = new StringBuilder();
		for (byte b : messageDigest.digest()) {
			string.append(String.format("%02x", b));
		}

		return string.toString();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		String value = sha1(file);
		System.out.println(value);
	}

}
