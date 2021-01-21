public class Oven extends Device {
    /////////////metablites//////////
    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskeuastis;
    private String onoma_syskeuhs;
    private String typos_syskeuhs;
    private int katanalosi;
    private String xroma;
    private String energeiaki_klasi;
    private Boolean systhma_katharismou ;
    private Boolean psifiaki_othoni;
    private String diakoptes;
    static int Counter;
    //////////////// Getters and Setters////////////////
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
        public void setxroma (String newxroma) {
        this.xroma = newxroma;
    }
        public String getxroma () {
            return xroma;
        }
            public void set (String newenergeiaki_klasi){
                this.energeiaki_klasi = newenergeiaki_klasi;
            }
            public String getenergeiaki_klasi () {
                return energeiaki_klasi;
            }
    public void setsysthma_katharismou (boolean newsysthma_katharismou){
        this.systhma_katharismou = newsysthma_katharismou;
    }
    public boolean getsysthma_katharismou () {
        return systhma_katharismou;
    }

    public void setpsifiaki_othoni (boolean newpsifiaki_othoni){
        this.psifiaki_othoni = newpsifiaki_othoni;
    }
    public boolean getpsifiaki_othoni () {
        return psifiaki_othoni;
    }
    public void setdiakoptes (String newdiakoptes){
        this.diakoptes = newdiakoptes;
    }
    public String getdiakoptes () {
        return diakoptes;
    }




    public Oven(){}
    Oven(int mikos, int ypsos, int vathos, String kataskeuastis, String onoma_syskeuhs,
         String typos_syskeuhs, int katanalosi, String xroma, String diakoptes  ,
         String energeiaki_klasi, Boolean psifiaki_othoni ,Boolean systhma_katharismou ){
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
        this.diakoptes=diakoptes;
        this.systhma_katharismou=systhma_katharismou;
        Counter++;
    }

    ////////////foyrnos//////////

    public void PrintOven() {
        System.out.println("diastaseis: "+"\nmikos:" +mikos  +"\nypsos:"  +ypsos  +"\nvathos:"  +vathos);
        System.out.println("kataskeuastis: " + kataskeuastis);
        System.out.println("onoma syskeuhs: " + onoma_syskeuhs);
        System.out.println("typos syskeuhs: " + typos_syskeuhs);
        System.out.println("katanalosi reumatos: " + katanalosi);
        System.out.println("xroma: " + xroma);
        System.out.println("psifiaki othoni: " + psifiaki_othoni);
        System.out.println("diakoptes: " + diakoptes );
        System.out.println("energeiaki klasi: " + energeiaki_klasi );
        System.out.println("systhma katharismou: " + systhma_katharismou);
    }
    //////////////////metritis//////////
    public int getCounterOven() {
        return Counter;}


}