package wc;

import java.io.IOException;
import java.util.Scanner;

import wc.command.count;
import wc.command.search;

public class start {
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("**** -all [�ļ���]  �����ļ����ַ��� / ���� / ����");
	        System.out.println("**** -c   [�ļ���]  �����ļ����ַ���");
	        System.out.println("**** -w   [�ļ���]  �����ļ��ʵ���Ŀ");
	        System.out.println("**** -l   [�ļ���]  �����ļ�������");
	        System.out.print("���������");
			Scanner s = new Scanner(System.in);
	        String m =s.nextLine();
	        String arr[]=m.split("\\s");
	        if (arr[0].equals("-s")) {
	        	System.out.print("�������ѯ���ļ���(��ģ����ѯ)��");
	            Scanner name = new Scanner(System.in);
	            String fileName = name.nextLine();
	        	search.foundFilePath(arr[1], fileName);
			}else {
				count.command(arr[1], arr[0]);	
			}
		}
	}
}