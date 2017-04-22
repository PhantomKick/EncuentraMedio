package encuentraMedio;

public class EncuentraMedio {
	
	public int funcion(){
		int n = 2;
		if(n <= 3) return -1;
		
		for(int i = 2; i <= n-1; i++){
			int s1 = 0;
			for(int j = 1; j < i; j++)
				s1 += j;
			
			int s2 = 0;
			for(int k = i+1; k <= n; k++)
				s2 += k;
			
			if(s1 == s2) return i;
		}
		
		return -1;
	}
	
	public int funcionOptimizada(int n){
		if(n <= 3) return -1;
		
		for(int i = 2; i <= n-1; i++){
			int s1 = i*(i-1)/2;
			int s2 = n*(n+1)/2 - s1 - i;
			
			if(s1 == s2) return i;
		}
		return -1;
	}
	
	public int funcionOptima(int n){
		if(n <= 3) return -1;
		
		return (int)Math.sqrt(n*(n+1)/2);
		
	}

}