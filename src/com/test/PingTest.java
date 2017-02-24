package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PingTest {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			pingGG("183.60.200.133");
		}
		
	}
	
	
	public static void pingGG(String ip){
		Runtime runtime = Runtime.getRuntime(); // ��ȡ��ǰ��������н�����
		Process process = null; // �������������
		String line = null; // ��������Ϣ
		InputStream is = null; // ������
		InputStreamReader isr = null; // �ֽ���
		BufferedReader br = null;
		boolean res = false;// ���
		try {
			process = runtime.exec("cmd /c ping " + ip); // PING
			is = process.getInputStream(); // ʵ����������
			isr = new InputStreamReader(is);// ��������ת�����ֽ���
			br = new BufferedReader(isr);// ���ֽ��ж�ȡ�ı�
			while ((line = br.readLine()) != null) {
				if (line.contains("TTL")) {
					res = true;
					break;
				}
			}
			is.close();
			isr.close();
			br.close();
			if (res) {
				System.out.println("ping ͨ  ...");
			} else {
				System.out.println("ping ��ͨ...");
			}
		} catch (IOException e) {
			System.out.println(e);
			runtime.exit(1);
		}
		
	}
	
	
}
