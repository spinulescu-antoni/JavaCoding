package Task1;

public enum Operatii {
    ADUNARE(1, "adunare", "OperatiideAdunare"),
    SCADERE(2,"scadere", "OperatiideScadere");

    private final int cod;
    private final String valoare;

    private final String nume;

    Operatii(int cod, String valoare, String nume){
        this.cod = cod;
        this.valoare = valoare;
        this.nume = nume;

    }

    public int getCod(){
        return cod;
    }

}
