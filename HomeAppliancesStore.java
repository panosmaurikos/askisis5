import java.util.Scanner;
public class HomeAppliancesStore {
    //////////metablites///////////
    static String etairia;
    static String dieuthinsi;
    static int ergazomenoi;
     static int Counter=0;
    ////////// Getters and Setters//////////
    public String getEtairia() {
        return this.etairia;
    }

    public void setEtairia(String newetairia) {
        this.etairia = newetairia;
    }

    public String getDieuthinsi() {
        return this.dieuthinsi;
    }

    public void setDieuthinsi(String newdieuthinsi) {
        this.dieuthinsi = newdieuthinsi;
    }

    public int getErgazomenoi() {
        return this.ergazomenoi;
    }

    public void setErgazomenoi(int newergazomenoi) {
        this.ergazomenoi = newergazomenoi;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("pliktrologise to onoma tis etairias: ");
        String etairia = myObj.nextLine();
            System.out.println("H eponimia ths etairias einai: " + etairia);
        {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("poia einai h dieuthinsi ths etairias: ");
            String dieuthinsi = myObj2.nextLine();

                System.out.println("H dieuthinsi ths etairias einai : " + dieuthinsi);
        }
        {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Posoi ergazomenoi douleuoun sthn etairia: ");
            int ergazomenoi = myObj3.nextInt();

                System.out.println("Oi ergazomenoi einai: " + ergazomenoi);

        }
        Fridge F = new Fridge(50, 180, 80, "samsung", "RS67N8211S9", "Fridge", 860, "mauro", 152, "A++", false, 90);
        F.PrintFridge();

        AirCondition AC = new AirCondition(758, 210, 200, "Midea ", "MA2-12NXD0-I", "Air Condition", 555, "aspro", 10500, "A+", true, 11000);
        AC.PrintAirCondition();

        WashineMachine WM = new WashineMachine(90, 50, 50, "Indesit", " BWE-81284X", "Washing Machine", 175, "portokali", 55, "A+", false, "B");
        WM.PrintWashineMachine();

        Oven O = new Oven(61, 60, 55, "Siemens", " HB513ABR00", "Oven", 140, "prasino", "statheroi", "A-", true, true);
        O.PrintOven();



        O.powerOff();
        AC.powerOn();
        F.powerOn();
        WM.powerOff();

        deviceStatus(AC);

        Counter = F.getCounterFridge() +WM.getCounterWashineMachine() + O.getCounterOven() + AC.getCounterAirCondition();
        System.out.println("yparxoun: " + Counter  +" syskeues syndedemenes");
    }

    public static void deviceStatus(Device d) {
        System.out.println("Device Status: " + d.status());
        System.out.println("Device Type: ");

        if (d instanceof Oven)
            System.out.println("Oven");

        if (d instanceof AirCondition)
            System.out.println("Air Condition");

        if (d instanceof WashineMachine)
            System.out.println("Washing Machine");

        if (d instanceof Fridge)
            System.out.println("Fridge");


    }



}