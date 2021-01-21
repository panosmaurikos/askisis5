
public class WashineMachine extends Device {
    //////////////metablites///////////
    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskeuastis;
    private String onoma_syskeuhs;
    private String typos_syskeuhs;
    private int katanalosi;
    private String xroma;
    private String energeiaki_klasi;
    private int RPMS;
    private Boolean psifiaki_othoni;
    private String apodosi_stipsimatos;
   static int Counter;
    /////////////Getters and Setters/////////////
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
        return kataskeuastis;
    }

    public void setxroma (String newxroma){
        this.xroma = newxroma;
    }
    public String getenergeiaki_klasi () {
        return energeiaki_klasi;
    }

    public void setenergeiaki_klasi(String newenergeiaki_klasi){
        this.energeiaki_klasi = newenergeiaki_klasi;
    }
    public int getRPMS () {
        return RPMS;
    }

    public void setRPMS (int newRPMS){
        this.RPMS = newRPMS;
    }
    public void setpsifiaki_othoni (boolean newpsifiaki_othoni){
        this.psifiaki_othoni = newpsifiaki_othoni;
    }
    public boolean getpsifiaki_othoni () {
        return psifiaki_othoni;
    }

        public void setapodosi_stipsimatos (String newapodosi_stipsimatos){
            this.apodosi_stipsimatos = newapodosi_stipsimatos;
        }

        public String getapodosi_stipsimatos () {
            return apodosi_stipsimatos;
        }






    ////////////////////plintirio///////////
    public WashineMachine(){}

    WashineMachine(int mikos, int ypsos, int vathos, String kataskeuastis, String onoma_syskeuhs,
                   String typos_syskeuhs, int katanalosi, String xroma, int RPMS  ,
                   String energeiaki_klasi, Boolean psifiaki_othoni ,String apodosi_stipsimatos ){
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskeuastis=kataskeuastis;
        this.onoma_syskeuhs=onoma_syskeuhs;
        this.typos_syskeuhs=typos_syskeuhs;
        this.katanalosi=katanalosi;
        this.xroma=xroma;
        this.psifiaki_othoni=psifiaki_othoni;
        this.energeiaki_klasi=energeiaki_klasi;
        this.RPMS=RPMS;
        this.apodosi_stipsimatos=apodosi_stipsimatos;
        Counter++;
    }

    public void PrintWashineMachine() {
        System.out.println("diastaseis: "+"\nmikos:" +mikos  +"\nypsos:"  +ypsos  +"\nvathos:"  +vathos);
        System.out.println("kataskeuastis: " + kataskeuastis);
        System.out.println("onoma syskeuhs: " + onoma_syskeuhs);
        System.out.println("typos syskeuhs: " + typos_syskeuhs);
        System.out.println("katanalosi reumatos: " + katanalosi);
        System.out.println("xroma: " + xroma);
        System.out.println("psifiaki othoni: " + psifiaki_othoni);
        System.out.println("apodosi_stipsimatos: " + apodosi_stipsimatos );
        System.out.println("energeiaki klasi: " + energeiaki_klasi );
        System.out.println("arithmos strofon ana lepto: " + RPMS);

    }
    /////////////////metritis//////////////
    public int getCounterWashineMachine() {
        return Counter;}


}

