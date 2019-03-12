//@zimo

package com.cs.zimo;

import java.util.Scanner;
public class zimo {
public static void main(String[] args){
	System.out.println("提示：输入非float型停止运行\n请输入学生成绩: ");
	Scanner sc=new Scanner(System.in);
	while(sc.hasNextFloat())			//实现循环输入
	{
	float score=sc.nextFloat();	
	if (score>=0&&score<=100) 
	{
		switch ((int)(score/10))
		{
		case 10:
			System.out.println("成绩：满分");
		break;
	    case 9: 
	    	System.out.println("成绩：优秀");  
	    break;
	    case 8:
	    	System.out.println("成绩：优秀");
	    break;
	    case 7:
	    	System.out.println("成绩：良");
	    break;
	    case 6:
	    	System.out.println("成绩：及格");
	    break;
	    default:
	    	System.out.println("成绩：不合格");
	    break;
		}
	}
	else
	{
		System.out.println("输入的成绩超出范围");

	}

	}
	}
	}

