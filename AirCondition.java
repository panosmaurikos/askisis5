public class AirCondition extends Device {
    ///////////////metablites/////////////////////
    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskeuastis;
    private String onoma_syskeuhs;
    private String typos_syskeuhs;
    private int katanalosi;
    private String xroma;
    private String energeiaki_klasi;
    private int isxus_thermansis;
    private int isxus_psiksis;
    private boolean Wifi;
   static int Counter;
    //// Getters and Setters//////
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
    public void setxroma (String newxroma){
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
    public void setisxus_thermansis (int newisxus_thermansis) {
        this.isxus_thermansis = newisxus_thermansis;
    }

        public int getisxus_thermansis () {
             return isxus_thermansis;
    }
    public void setisxus_psiksis (int newisxus_psiksis) {
        this.isxus_psiksis = newisxus_psiksis;
    }

    public int getisxus_psiksis () {
        return isxus_psiksis;
    }
    public void setWifi (boolean newWifi){
        this.Wifi = Wifi;
    }
    public boolean getWifi () {
        return Wifi;
    }
    ////////////  aircondition /////////////////
    public AirCondition(){}
    AirCondition(int mikos, int ypsos, int vathos, String kataskeuastis, String onoma_syskeuhs,
                 String typos_syskeuhs, int katanalosi, String xroma, int isxus_thermansis ,
                 String energeiaki_klasi, boolean Wifi ,int isxus_psiksis){
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskeuastis=kataskeuastis;
        this.onoma_syskeuhs=onoma_syskeuhs;
        this.typos_syskeuhs=typos_syskeuhs;
        this.katanalosi=katanalosi;
        this.xroma=xroma;
        this.isxus_thermansis=isxus_thermansis;
        this.energeiaki_klasi=energeiaki_klasi;
        this.Wifi=Wifi;
        this.isxus_psiksis=isxus_psiksis;
        ++Counter;
    }
    //// sinartisisis aircondition //////
    public void PrintAirCondition() {
        System.out.println("diastaseis: "+"\nmikos:" +mikos  +"\nypsos:"  +ypsos  +"\nvathos:"  +vathos);
        System.out.println("kataskeuastis: " + kataskeuastis);
        System.out.println("onoma syskeuhs: " + onoma_syskeuhs);
        System.out.println("typos syskeuhs: " + typos_syskeuhs);
        System.out.println("katanalosi reumatos: " + katanalosi);
        System.out.println("xroma: " + xroma);
        System.out.println("isxus thermansis: " + isxus_thermansis);
        System.out.println("isxus psiksis: " + isxus_psiksis);
        System.out.println("energeiaki klasi: " +energeiaki_klasi );
        System.out.println("Wifi: " + Wifi);

    }
    //////////// metritis//////////////////
    public int getCounterAirCondition() {
        return Counter;}


}