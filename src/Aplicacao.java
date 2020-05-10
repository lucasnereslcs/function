import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Tv", 1200.00));
		produtos.add(new Produto("Celular", 800.00));
		produtos.add(new Produto("Radio", 980.00));

		List<String> nomes = produtos.stream().map(new Maiusculas()).collect(Collectors.toList());

		nomes.forEach(System.out::println);

	}

}
