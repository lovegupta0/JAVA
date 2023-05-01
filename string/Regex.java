package com.string;

import java.util.*;
import java.util.regex.*;

public class Regex {
	public void check(String str) {
		try {
		String pattern="[a-z]+";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher(str);
		System.out.println(match.matches());
		System.out.println(str.substring(match.start(),match.end()));
		} catch(IllegalStateException e) {
			System.out.println(e);
		}
		
		Pattern p1 = Pattern.compile("0 145");
		Matcher m = p1.matcher("0145as");  
		boolean b = m.matches();
		System.out.println(b);
		
		
	}

	
}
