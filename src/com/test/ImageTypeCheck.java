package com.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;

import eu.medsea.mimeutil.MimeUtil;
import eu.medsea.mimeutil.MimeUtil2;

public class ImageTypeCheck {

	public static boolean isRealImg(InputStream imageFile) {
		try {
			// MimeUtil util2 = new MimeUtil();
			MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");

			Collection co = MimeUtil.getMimeTypes(toByteArray(imageFile)); // 这里的imageFile就是亲上传的File文件

			String contType = co.toString();
			String type = contType.split("/")[1];
			if (type.equals("pjpeg")) {
				type = "jpeg";
			}
			contType = type;
			// 支持gif", "jpeg", "bmp", "png
			final String[] CONTACT_ALLOW_TYPES = { "gif", "jpeg", "bmp", "png", "x-png", "x-bmp", "x-ms-bmp" };

			boolean checkResult = false;
			for (String allowType : CONTACT_ALLOW_TYPES) {
				if (allowType.equals(contType)) {
					checkResult = true;
				}
			}
			if (!checkResult) {
				System.out.println("不是图片文件");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static byte[] toByteArray(InputStream input) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		copy(input, output);
		return output.toByteArray();
	}

	public static int copy(InputStream input, OutputStream output) throws IOException {
		long count = copyLarge(input, output);
		if (count > 2147483647L) {
			return -1;
		}
		return (int) count;
	}

	public static long copyLarge(InputStream input, OutputStream output) throws IOException {
		byte[] buffer = new byte[4096];
		long count = 0L;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
//		String imagePath = "C://Users//Administrator//Desktop//banner图//index_y1.png";
		String imagePath = "C://Users//Administrator//Desktop//01_Java学习路线图.jpg";
		File image = new File(imagePath);
		InputStream in = new FileInputStream(image);
		System.out.println(isRealImg(in));
	}

}