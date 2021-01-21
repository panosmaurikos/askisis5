public class Fridge extends Device {
    //////metablhtes//////
    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskeuastis;
    private String onoma_syskeuhs;
    private String typos_syskeuhs;
    private int katanalosi;
    private String xroma;
    private String energeiaki_klasi;
    private int xwritikotita_sunthrishs;
    private int xwritikotita_psiksis;
    private boolean Mini_Bar;
    static int Counter;
    ///////////////// Getters and Setters///////////////
    public int getMikos () {
        return mikos;
    }

    public void setMikos (int newmikos){
        this.mikos = newmikos;
    }

    public int getYpsos () {
        return ypsos;
    }

    public void setYpsos (int newypsos){
        this.ypsos = newypsos;
    }

    public int getVathos () {
        return vathos;
    }

    public void setVathos (int newvathos){
        this.vathos = newvathos;
    }

    public String getKataskeuastis () {
        return kataskeuastis;
    }

    public void setKataskeuastis (String newkataskeuastis){
        this.kataskeuastis = newkataskeuastis;
    }

    public String getOnoma_syskeuhs () {
        return onoma_syskeuhs;
    }

    public void setOnoma_syskeuhs (String newonoma_syskeuhs){
        this.onoma_syskeuhs = newonoma_syskeuhs;
    }

    public String getTypos_syskeuhs () {
        return typos_syskeuhs;
    }

    public void setTypos_syskeuhs (String newtypos_syskeuhs){
        this.typos_syskeuhs = newtypos_syskeuhs;
    }

    public int getKatanalosi () {
        return katanalosi;
    }

    public void setKatanalosi (int newkatanalosi) {
        this.katanalosi = newkatanalosi;
    }

    public String getxroma () {
        return xroma;
    }

    public void setxroma (String newxroma){
        this.xroma = newxroma;
    }
    public String energeiaki_klasi () {
        return typos_syskeuhs;
    }

    public void setenergeiaki_klasi (String newenergeiaki_klasi){
        this.energeiaki_klasi = newenergeiaki_klasi;
    }
    public int getxwritikotita_sunthrishs() {
        return xwritikotita_sunthrishs;
    }

    public void setxwritikotita_sunthrishs (int newxwritikotita_sunthrishs){
        this.xwritikotita_sunthrishs = newxwritikotita_sunthrishs;
    }

    public int getxwritikotita_psiksis() {
        return xwritikotita_psiksis;
    }

    public void setxwritikotita_psiksis(int newxwritikotita_psiksis){
        this.xwritikotita_psiksis= newxwritikotita_psiksis;
    }

    public void setMini_Bar (boolean newMini_Bar){
        this.Mini_Bar = newMini_Bar;
    }
    public boolean getMini_Bar () {
        return Mini_Bar;
    }



    ///////////////phigio//////////////////
    public Fridge(){}
    Fridge(int mikos, int ypsos, int vathos, String kataskeuastis, String onoma_syskeuhs,
           String typos_syskeuhs, int katanalosi, String xroma, int xwritikotita_sunthrishs ,
           String energeiaki_klasi, boolean Mini_Bar ,int xwritikotita_psiksis){
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskeuastis=kataskeuastis;
        this.onoma_syskeuhs=onoma_syskeuhs;
        this.typos_syskeuhs=typos_syskeuhs;
        this.katanalosi=katanalosi;
        this.xroma=xroma;
        this.xwritikotita_sunthrishs=xwritikotita_sunthrishs;
        this.energeiaki_klasi=energeiaki_klasi;
        this.Mini_Bar=Mini_Bar;
        this.xwritikotita_psiksis=xwritikotita_psiksis;
        Counter++;
    }
    ////////////////synartisis phigioy////////////////////////
    public void PrintFridge() {
        System.out.println("diastaseis: "+"\nmikos:" +mikos  +"\nypsos:"  +ypsos  +"\nvathos:"  +vathos);
        System.out.println("kataskeuastis: " + kataskeuastis);
        System.out.println("onoma syskeuhs: " + onoma_syskeuhs);
        System.out.println("typos syskeuhs: " + typos_syskeuhs);
        System.out.println("katanalosi reumatos: " + katanalosi);
        System.out.println("xroma: " + xroma);
        System.out.println("xwritikotita sunthrishs: " + xwritikotita_sunthrishs);
        System.out.println("xwritikotita psiksis: " + xwritikotita_psiksis);
        System.out.println("energeiaki klasi: " +energeiaki_klasi );
        System.out.println("Mini Bar: " + Mini_Bar);

    }
    ///////////////metritis////////////////////
    public int getCounterFridge() {
        return Counter;}


}