
public class Valores implements ValoresITF {

	public Integer[] valores;
	
	public Valores() {
		valores = new Integer[10];
	}
	
	public boolean ins(Integer v) {
		
		if(v > 0 && size() < 10) {
			
			for (int i = 0; i < valores.length; i++) {
				
				if(valores[i] == null) {
					valores[i] = v;
					break;
				}
			}
			return true;
			
		} else return false;
	}

	public Integer del(Integer i) {
		
		if(size() == 0)
			return -1;
		
		if(valores[i] != null) {
			Integer aux = valores[i];		 
			valores[i] = null;
			return aux;
		}
		return -1;
	}

	public Integer size() {
		
		Integer tamanho = 0;
		
		for(int i = 0; i < valores.length; i++) {
			
			if(valores[i] != null) {
				tamanho++;
			}
		}
		
		return tamanho;
	}

	public double mean() {
		
		if(size() == 0) {
			
			return -1;
			
		} else if (size() > 0) {
			
			Integer soma = 0;
			
			for(int i = 0; i < valores.length; i++) {
				
				if(valores[i] != null) {
					soma+= valores[i];
				}				
			}
			
			return soma / size();
		}
		
		return 0;		
	}

	public Integer greater() {
		
		if(size() == 0)
			return -1;
		
		Integer maior = -1;
		
		for(int i = 0; i < valores.length; i++) {
			
			if(valores[i] != null) {
				if(valores[i] > maior) {
				maior = valores[i];
				}
			}
		}
		
		return maior;
	}

	public Integer lower() {
		
		if(size() == 0)
			return -1;
		
		Integer menor = 999;
		
		for(int i = 0; i < valores.length; i++) {
			
			if(valores[i] != null) {
				if(valores[i] < menor) {
					menor = valores[i];
				}
			}
		}
		
		return menor;
	}

}
