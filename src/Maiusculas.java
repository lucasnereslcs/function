import java.util.function.Function;

public class Maiusculas implements Function<Produto, String> {

	@Override
	public String apply(Produto p) {
		// TODO Auto-generated method stub
		return p.getNome().toUpperCase();
	}

}
