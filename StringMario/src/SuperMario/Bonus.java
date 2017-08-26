package SuperMario;

public class Bonus {
    private String nev; //ermek, gomba, star, 1 up
    private int ermek;        //100erem +1 elet

    private boolean szuper;    //gomba �ltal nagyobbra n�, s�r�l�skor lecs�kken
    private boolean serthetetlen;    //csillag 2 l�p�s s�rthetetlenseg
    private int upp;    //plusz �let

    public String getNev() {
        return nev;
    }

    public boolean isSzuper() {
        return szuper;
    }

    public int getErmek() {
        return ermek;
    }

    public boolean isSerthetetlen() {
        return serthetetlen;
    }

    public int getUpp() {
        return upp;
    }

    public Bonus(String nev, int ermek, int szuper, int serthetetlen, int upp) {
        this.nev = nev;
        this.ermek += ermek;
        if (ermek == 100) {
            Ellenseg.getLive();
        }
        if (szuper == 1) {
            this.szuper = true;
        } else {
            this.szuper = false;
        }

        if (serthetetlen == 1) {
            this.serthetetlen = true;
        } else {
            this.serthetetlen = false;
        }
        this.upp = upp;
        //Ellenseg.live+upp;
    }
}
