package generic.product;

public class GenericExample {
	public static void main(String[] args) {

		Product<Tv, String> tvProduct = new Product<>();
		tvProduct.setKind(new Tv());
		tvProduct.setModel("스마트Tv");
		Tv tv = tvProduct.getKind();
		String tvModel = tvProduct.getModel();
		System.out.println("Product 01 : " + tv.getClass() + "의 " + tvModel );
		
		
		Product<Car, String> carProduct = new Product<>();
		carProduct.setKind(new Car());
		carProduct.setModel("SUV자동차");
		Car car = carProduct.getKind();
		String carModel = carProduct.getModel();
		System.out.println("Product 02 : " + car.getClass() + "의 " + carModel );
	}
}