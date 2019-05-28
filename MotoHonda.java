
public class MotoHonda implements Moto {

	private Carro carro = new CarroFiat();

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		carro.corre();
	}

}
