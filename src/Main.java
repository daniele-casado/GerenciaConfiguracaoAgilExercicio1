
public class Main {

	public static void main(String[] args) {
		
		ValoresITF valores = new Valores();
		
		System.out.println("Número inserido: 1 " + valores.ins(1));
		System.out.println("Número inserido: 2 " + valores.ins(2));
		System.out.println("Número inserido: 4 " + valores.ins(4));
		System.out.println("Número inserido: 6 " + valores.ins(6));
		System.out.println("Número inserido: 8 " + valores.ins(8));
		System.out.println("Número inserido: 10 " + valores.ins(10));
		System.out.println("Número inserido: 12 " + valores.ins(12));
		System.out.println("Número inserido: 14 " + valores.ins(14));
		System.out.println("Número inserido: 16 " + valores.ins(16));
		System.out.println("Número inserido: 18 " + valores.ins(18));
		System.out.println("Número inserido: 20 " + valores.ins(20));
		
		System.out.println("Número deletado: " + valores.del(0));
		
		System.out.println("Quantidade de itens da lista: " + valores.size());
		System.out.println("Média dos números da lista: " + valores.mean());
		System.out.println("Maior número da lista: " + valores.greater());
		System.out.println("Menor número da lista: " + valores.lower());
	}

}
