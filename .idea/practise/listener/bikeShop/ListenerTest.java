package listener.bikeShop;

public class ListenerTest {

	public static void main(String[] args) 
	{
		Fahrrad rad1 = new Fahrrad(1, 1500, 15);
		Fahrrad rad2 = new Fahrrad(1, 2500, 25);
		
		PrivatKunde kundeA = new PrivatKunde("Hans", 2000);
		Haendler haendlerA = new Haendler("Mainburg", 20);

		rad1.registriereInteressent(kundeA);
		rad1.registriereInteressent(haendlerA);
		rad2.registriereInteressent(kundeA);
		rad2.registriereInteressent(haendlerA);

		rad1.benachrichtigeInteressenten();
		rad2.benachrichtigeInteressenten();

		
		System.out.println("+++ Geänderte Fahrraddaten +++");
		rad1.setzePreis(2100);
		rad1.setzeLieferzeit(21);

	}

}
