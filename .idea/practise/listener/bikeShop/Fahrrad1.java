package listener.bikeShop;

import java.util.ArrayList;

public class Fahrrad1
{
	private ArrayList<Interessent> interessenten = new ArrayList<Interessent>();

	private int id;
	private double preis;
	private int lieferzeitD;
	
	public Fahrrad1(int id, double preis, int lieferzeitD)
	{
		this.id = id;
		this.preis = preis;
		this.lieferzeitD = lieferzeitD;
	}
	
	void setzePreis(double preis)
	{
		this.preis = preis;
		benachrichtigeInteressenten();
	}
	
	double getPreis()
	{
		return this.preis;
	}

	void setzeLieferzeit(int lieferzeitD)
	{
		this.lieferzeitD = lieferzeitD;
		benachrichtigeInteressenten();
	}
	
	int getLieferzeitD()
	{
		return this.lieferzeitD;
	}

	void registriereInteressent(Interessent interessent)
	{
		this.interessenten.add(interessent);
	}

	void entferneInteressent(Interessent interessent)
	{
		this.interessenten.remove(interessent);
	}

	void benachrichtigeInteressenten()
	{
		for (Interessent interessent : this.interessenten)
		{
			interessent.benachrichtige(this);
		}
	}

}
