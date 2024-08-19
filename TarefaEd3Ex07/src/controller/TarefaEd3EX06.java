package controller;

public class TarefaEd3EX06 {
	
	public TarefaEd3EX06 () {
		super();
	}
		
	public int Ex07 (int num, int resp){
		if (num < 1) {
			return resp;
//			esta função serve apenas para contar o numero de algarismos presentes no numero, para que assim possamos criar um vetor com o numero de posições adequandas 
		}else {
			num = num /10;
			resp++;
		}
		return Ex07(num, resp);
		
			
	}
	
	public int CarregaVet (int[] vet, int cta, int num) {
		if ( cta >= vet.length) {
			return SomaVet(vet,0,0);
//			esta função vai estar carregando o vetor e chamando o ultimo metodo "SomaVet" paraa realizar a soma
		}else {
			vet[cta] = num % 10;
		}
		return CarregaVet (vet,cta+1, num/10);
//		no retorno mantemos o vetor intocado, no entanto acressemos 1 no contador, e dividimos o numero por 10, para assim retirar um algarismo que já foi colocado no vetor
	}
	
	
	
	
	
	public int SomaVet ( int[] vet, int cta, int soma) {
		if (cta >= vet.length) {
			return soma;
//			nesta função apenas realizamos a soma simples do vetor, com um contador começando de 0 e indo ate o tamanho do vetor.
		}else {
			soma = soma + vet[cta];
		}
		return SomaVet(vet, cta+1, soma);
//		no retorno apenas acressentamos 1 no contador para que assim possa percorrer todo o vetor
		
	}
		
	
}
