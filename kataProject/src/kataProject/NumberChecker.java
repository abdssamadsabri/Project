package kataProject;

public class NumberChecker {

	public Object encrypt(int i) {
		
		NumberChecker check = new NumberChecker();
		String numberStr = Integer.toString(i);		
        StringBuilder sb = new StringBuilder();
        boolean isDividable = false;
        boolean isContaining = false;
        
		if(check.isDivisor(3,i)){
			sb.append("Foo");
			isDividable=true;
		}
		if(check.isDivisor(5,i)){
			sb.append("Bar");
			isDividable=true;
		}
		if(check.isDivisor(7, i)){
			sb.append("Qix");
			isDividable=true;
		}
		
		for(int j=0;j<numberStr.length();j++){
			char c = numberStr.charAt(j);
			if(c=='3'){
				sb.append("Foo");
				isContaining = true;
			}
			if(c=='5'){
				sb.append("Bar");
				isContaining = true;
			}
			if(c=='7'){
				sb.append("Qix");
				isContaining = true;
			}
			
		}
		
		if (!isDividable && !isContaining) {
            sb.append(numberStr);
        }
		
		return sb.toString();
		
	}

	public boolean isDivisor(int j, int i) {
        if(i%j==0) return true;
        else return false;
	}

}
