package aula08;

public class ExemploString {
	public static void main(String[] args) {

		String str = "FiAP Paulista";

		int tamanhoStr = str.length();
		System.out.println(tamanhoStr);

		for (int i = 0; i < tamanhoStr; i++) {

			System.out.println(str.charAt(i));

		}
	}

}
