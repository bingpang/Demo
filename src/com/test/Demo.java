package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo {
	public static void main(String[] args) throws IOException {
		spider();
	}

	public static void spider() throws IOException {
		URL url = new URL("https://www.jd.com/");
		URLConnection conn = url.openConnection();
		BufferedReader uf = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		String line = null;
		String reg = "<a[^>]*href=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>(.*?)</a>";
		Pattern p = Pattern.compile(reg);
		while ((line = uf.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				System.out.println(m.group());
			}

		}
	}
}
