package com.SecretMessageDecoder;

import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		MessageDecoder md=new MessageDecoder();
		int res=md.decodeCharacter(ch);
		System.out.println(res);
	}

}
