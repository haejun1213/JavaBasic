package generic.rentable;

public class HomeAgency implements Rentable<Home> {
public Home rent() {
	System.out.println("집을 rent했습니다.");
	return new Home();
}
}
