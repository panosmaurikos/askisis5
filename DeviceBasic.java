public interface DeviceBasic {
    void setMikos (int mikos);
    void setYpsos (int ypsos);
    void setVathos (int vathos);
    void setKataskeuastis (String kataskeuastis);
    void setOnoma_syskeuhs (String onoma_syskeuhs);
    void setTypos_syskeuhs (String typos_syskeuhs);
    void setKatanalosi (int katanalosi);

////gettter kai setter //////////////
    int getMikos();

    int getYpsos();

    int getVathos();

    String getKataskeuastis();

    String getOnoma_syskeuhs();

    String getTypos_syskeuhs();

    int getKatanalosi();

    public void powerOn();
    public void powerOff();                 ////////// status//////////////
    public int periodicMantainance();
    public boolean status();

}
