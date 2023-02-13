package fassade.produktion;

public enum MontageElement {
    LENKER ("Lenker", 8, 20),
    VORDERRAD ("Vorderrad", 14, 40),
    BREMSE ("Bremse", 6, 10);

    private String bezeichnung;
    private double schraubeDurchmesserMm;
    private double anzugsdrehmomentNm;

    MontageElement(String bezeichnung, double schraubeDurchmesserMm, double anzugsdrehmomentNm) {
        this.bezeichnung = bezeichnung;
        this.schraubeDurchmesserMm = schraubeDurchmesserMm;
        this.anzugsdrehmomentNm = anzugsdrehmomentNm;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getSchraubeDurchmesserMm() {
        return schraubeDurchmesserMm;
    }

    public double getAnzugsdrehmomentNm() {
        return anzugsdrehmomentNm;
    }
}
