package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PingUtil {
	
	//ping��ip
	private static final String HERMAN_IP = "183.60.200.133 -t -l 1450";
	
	public static void test0() {
		// ��ȡ��ǰ��������н��̶���
		Runtime runtime = Runtime.getRuntime();
		// �������������
		Process process = null;
		// ���
		boolean step = true;
		int i=0;
		while(step){
			ping(i,runtime,process);
			if(i>10){
				break;
			}
			i++;
		}
		if(i>10){
			System.out.println("ping " + HERMAN_IP+"ͨ��......");
		}
	}
	
	private static void ping(int count,Runtime runtime,Process process){
		try {
			// ִ��PING����
			process = runtime.exec("ping " + HERMAN_IP);
			// ʵ����������
			InputStream is = process.getInputStream();
			// ��������ת�����ֽ���
			InputStreamReader isr = new InputStreamReader(is);
			// ���ֽ��ж�ȡ�ı�
			BufferedReader br = new BufferedReader(isr);
			String line="";
			while ((line = br.readLine()) != null) {
				if (line.contains("TTL")) {
					System.out.println(line);
				}else if((count==0)&&line.indexOf("���� 32 �ֽڵ�����")>-1){
					System.out.println(line);
					count++;
				}
			}
			is.close();
			isr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			runtime.exit(1);
		}
	}
	public static void main(String[] args) {
		//ѭ��ping 100��
		test0();
		//һֱpingֻ���HERMAN_IP = "www.baidu.com -t";
	}
}
