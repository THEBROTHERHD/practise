package fassade.produktion;

import jdk.jshell.SourceCodeAnalysis;

public class Montage {

    private static double blende = 0.5;
    private static Camera camera = new Camera(blende);
    private static ComputerVision cv = new ComputerVision(camera);

    private static Schrauber schrauber = new Schrauber();
    private static Roboter roboter = new Roboter(schrauber);

    private static Dokumentation dokumentation = new Dokumentation();

    public static void montiere(MontageElement element) {
        System.out.println("\n\nMontage " + element.getBezeichnung() + "\n");
        Pose pose = cv.sucheLoch(element.getSchraubeDurchmesserMm());
        roboter.move(pose);
        schrauber.dreheSchraubeEin(element.getAnzugsdrehmomentNm());
        dokumentation.add(element.getBezeichnung(), camera.aufname());
    }
}
