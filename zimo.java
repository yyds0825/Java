//@zimo

package com.cs.zimo;

import java.util.Scanner;
public class zimo {
public static void main(String[] args){
	System.out.println("��ʾ�������float��ֹͣ����\n������ѧ���ɼ�: ");
	Scanner sc=new Scanner(System.in);
	while(sc.hasNextFloat())			//ʵ��ѭ������
	{
	float score=sc.nextFloat();	
	if (score>=0&&score<=100) 
	{
		switch ((int)(score/10))
		{
		case 10:
			System.out.println("�ɼ�������");
		break;
	    case 9: 
	    	System.out.println("�ɼ�������");  
	    break;
	    case 8:
	    	System.out.println("�ɼ�������");
	    break;
	    case 7:
	    	System.out.println("�ɼ�����");
	    break;
	    case 6:
	    	System.out.println("�ɼ�������");
	    break;
	    default:
	    	System.out.println("�ɼ������ϸ�");
	    break;
		}
	}
	else
	{
		System.out.println("����ĳɼ�������Χ");

	}

	}
	}
	}

