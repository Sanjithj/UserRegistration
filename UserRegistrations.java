package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrations {

	    public boolean firstName(String name){
	        boolean check = Pattern.matches("([A-Z][a-z]{2,})",name);
	        return check;
	    }
}
