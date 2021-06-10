package com.sg;

public class StringOps {
	/*Static Method*/
	public static String concat(String a, String b, String c) {
		return a.concat(" ").concat(b).concat(" ").concat(c);
	}

	public String multiConcat(String a, String b, String c, String d, String e) {
		return a+" "+b+" "+c+" "+d+" "+e;
	}
}
