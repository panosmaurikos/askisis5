public abstract class Device implements DeviceBasic {
//////////////metablhtes ////////////////////////////////////////////////////////////////
    private  int mikos;
    private  int ypsos;
    private  int vathos;
    private  String kataskeuastis;
    private  String onoma_syskeuhs;
    private  String typos_syskeuhs;
    private  int katanalosi ;
       private boolean status;
//////////////////////////////////gettter kai setter/////////////////////////////////////////////////////////////
    public void setMikos (int mikos){
        this.mikos = mikos;
    }
    public void setYpsos (int ypsos){
        this.ypsos = ypsos;
    }
    public void setVathos (int vathos){
        this.vathos = vathos;
    }
    public  void setKataskeuastis (String kataskeuastis){
        this.kataskeuastis = kataskeuastis;
    }
    public  void setOnoma_syskeuhs (String onoma_syskeuhs){
        this.onoma_syskeuhs = onoma_syskeuhs;
    }
    public  void setTypos_syskeuhs (String typos_syskeuhs){
        this.typos_syskeuhs = typos_syskeuhs;
    }
    public  void setKatanalosi (int katanalosi){
        this.katanalosi = katanalosi;
    }


    public  int getMikos () {
        return mikos;
    }
    public  int getYpsos () {
        return ypsos;
    }
    public  int getVathos () {
        return vathos;
    }
    public  String getKataskeuastis () {
        return kataskeuastis;
    }
    public  String getOnoma_syskeuhs () {
        return onoma_syskeuhs;
    }
    public  String getTypos_syskeuhs () {
        return typos_syskeuhs;
    }
    public  int getKatanalosi () {
        return  katanalosi;
    }

    @Override
    public void powerOn() {
        status=true;
    }

    @Override
    public void powerOff() {
        status=false;
    }
                                                          //// to  Overriding
    @Override
    public int periodicMantainance() {
        return 0;
    }

    @Override
    public boolean status() {
        return status;
    }
}