package kodlama.io.Hrms.core.utilities.randomcodecreate;

import org.springframework.stereotype.Service;

@Service
public class RandomCode {
	
	public String getNumericString() {
		int n = 5;
		String numericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789";
		
		StringBuilder sb = new StringBuilder(n);
		
		for(int i=0; i<n ; i++) {
			
			int index=(int)(numericString.length()*Math.random());
			
			sb.append(numericString.charAt(index));
		}
		
		return sb.toString();
	}
}
