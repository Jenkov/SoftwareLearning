package com.palindrome;

public class Palindrome {

	public String maxPalindrome(String input){
		int max = 1;
		String res = null;
		
		if(input==null||"".equals(input.trim()))
			return input;
		for(int i=0;i<input.length();i++){
			for(int j=i+1;j<input.length()+1;j++){
				String newstr = input.substring(i,j);
				if(isPalindrome(newstr)){
					if(max<j-i){
						max= j-i;
						res = newstr;
					}
						
				}
			}
		}
		return res;
	}
	public boolean isPalindrome(String str){
		char[] cs = str.toCharArray();
		int i=0,j=cs.length-1;
		for(;i<j;i++,j--){
			if(cs[i]!=cs[j]){
				break;
			}
		}
		if(i<j){
			return false;
		}else{
			return true;
		}
	}
	public static void main(String[] args) {
		boolean res = new Palindrome().isPalindrome("ababa");
		System.out.println(res);
		
		String maxPalindrome = new Palindrome().maxPalindrome("cgsbbababab");
		System.out.println(maxPalindrome);
		
		/*String substr = "China".substring(0,1);
		System.out.println(substr);*/
	}

}
