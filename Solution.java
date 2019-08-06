package com.test;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeoutException;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			
			
			for (int a0 = 0; a0 < t; a0++) {
				int a = 1, b = 2, c = 0;
				list.add(a);
				list.add(b);
				long n = in.nextLong();

				for (long i = 0; i < n; i++) {

					c = a + b;
					if (c < n) {
						list.add(c);
						a = b;
						b = c;
					} else {
						break;
					}
				}
				System.out.println(list.toString());
				long sum = 0;
				for (long m : list) {
					if (m % 2 == 0) {
						sum = sum + m;
					}
				}
				System.out.println(sum);
				list.clear();
			}
		} catch (Exception ie) {
			ie.printStackTrace();
		}
	}
}
