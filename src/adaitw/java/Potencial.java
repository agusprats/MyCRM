package adaitw.java;

public enum Potencial {
    negativo("-"), neutral("|"), positivo("+");

    private Potencial(String signo) {
        this.signo=signo;
    }

    public String getSigno(){
        return signo;
    }
    private String signo;

}

/*


     negativo,
    neutral,
    positivo;

    private Potencial() {
    }
    */
