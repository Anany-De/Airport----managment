import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
class arrival
{
    String name;
    int id;
    String address;
    String time;
    double fare;
    public static int count=1;
    public arrival(String nm,int id,String address,String time,double fare)
    {
        this.name=nm;
        this.id=id;
        this.address=address;
        this.time=time;
        this.fare=fare;
        System.out.println("FLIGHT ARRIVAL DETAILS ARE--------");
        System.out.println("--------------------");
        System.out.println("name of flight is---"+nm);
        System.out.println("id of flight is----"+id);
        System.out.println("address of flight is----"+address);
        System.out.println("time of arrival is-----"+time);
        System.out.println("fare of this flight is-----"+fare);
        System.out.println("arrival count is----->"+count++);
        System.out.println("---------------------");
    }
}
class departure
{
    String name;
    int id;
    String address;
    String time;
    double fare;
    public static int count=1;
    public departure(String nm,int id,String address,String time,double fare)
    {
        this.name=nm;
        this.id=id;
        this.address=address;
        this.time=time;
        this.fare=fare;
        System.out.println("FLIGHT DEPARTED DETAILS ARE------");
        System.out.println("----------------");
        System.out.println("name of flight is----"+nm);
        System.out.println("id of flight is-----"+id);
        System.out.println("address of flight is----"+address);
        System.out.println("time of departure is----"+time);
        System.out.println("fare of this flight is---"+fare);
        System.out.println("departure count is--->"+count--);
        System.out.println("------------------------------");

    }
}
class enquiry
{
    String name;
    int id;
    String address;
    String time;
    double fare;
    public static String count="AVALIABLE";
    public enquiry(String nm,int id,String address,String time,double fare)
    {
        Scanner sc=new Scanner(System.in);
        this.name=nm;
        this.id=id;
        this.address=address;
        this.time=time;
        this.fare=fare;
        String locate;
        System.out.println("ENTER CURRENT AIRPORT STATION TO FLY<------------>");
        locate=sc.nextLine();
        if(locate.equals("AMRITSAR"))
        {
            System.out.println("-----SEATS AVALIABLE-----");
            System.out.println("-------------------------");
            System.out.println("name of the flight is-----"+nm);
            System.out.println("id of flight is-----------"+id);
            System.out.println("address of flight is-----------"+address);
            System.out.println("time of departure is-----------"+time);
            System.out.println("fare of this flight is---------"+fare);
            System.out.println("STATUS OF CONFIRMATION IS ------->"+count);
            System.out.println("------------------------");
        }
        else
        {
            System.out.println("--------SORRY SEATS ARE NOT AVALIABLE---------->");
        }

    }
}
class passenger
{
    String name,address,timing,fladdress;
    int age,flid;
    double fare;
    public passenger(String name,int age,String address,String timing,String fladdress,int flid,double fare)
    {
        this.name=name;
        this.address=address;
        this.timing=timing;
        this.fladdress=fladdress;
        this.age=age;
        this.flid=flid;
        this.fare=fare;
    }

    public boolean SearchPassenger(String nm)
    {
        if(name.equals(nm))
        {
            System.out.println("PASSENGER SUCCESSFULLY ENTERED IN DATABASE-----");
            System.out.println("------------->>PASSENGER'S DETAILS ARE------------>>");
            System.out.println("FULL NAME IS-------" + name);
            System.out.println("PASSENGER'S AGE----------" + age);
            System.out.println("PASSENGER'S ADDRESS-----" + address);
            System.out.println("FLIGHT TIMING IS---------" + timing);
            System.out.println("JOURNEY FROM AND TO---------" + fladdress);
            System.out.println("FLIGHT ID IS-----------" + flid);
            System.out.println("TOTAL FARE OF JOURNEY IS-------" + fare);
            System.out.println("-----HAPPY JOURNEY---------");
            return true;
        }
        else 
        {
            return false;
        }
    }
}
class airf 
{
    public static void main(String[] args) 
    {
        int t=1;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------------------------------------------");
            System.out.println("-----WELCOME TO ABC AIRPORT MANAGEMENT SYSTEM------");
            System.out.println("-------------------------------------------------------");
            System.out.println("CHOOSE YOUR SPECIFIC OPERATION---------");
            System.out.println("1. ARRIVAL'S--------");
            System.out.println("2. DEPARTURE'S-------");
            System.out.println("3. ENQUIRY'S---------");
            System.out.println("4. SHOW ADDED PASSENGER'S BY SEARCH METHOD'S <---------->");
            int no = sc.nextInt();
            switch (no) 
            {
                case 1:
                    arrival fl = new arrival("AIRINDIA", 456321, "LKO TO ASR", "11:54-PM", 4512.63);
                    arrival f2 = new arrival("JETAIRWAYS", 458421, "SIWAN TO ASR", "12:45-AM", 84521.32);
                    break;
                case 2:
                    System.out.println("FIRST FLIGHT DEPARTED DELAY WITH 1 HOURS");
                    departure d1 = new departure("INDIGO", 145266, "PATNA TO GORAKHPUR", "13:26-PM", 7865.3254);
                    departure d2 = new departure("GOAIR", 564789, "SIWAN TO BANGALORE", "16:55-PM", 2865.8754);
                    break; 
                case 3:
                    enquiry e1 = new enquiry("EMIRATES", 456327, "AMRITSAR TO SIWAN", "12:45-AM", 4562.84);
                    break;
                case 4:
                    System.out.println("THIS IS PASSENGER'S RECORD'S AREA------>>");
                    passenger p1 = new passenger("AMIT", 19, "SIWAN", "10:05-PM","LKO TO ASR", 12345, 5632.21);
                    passenger p2 = new passenger("ALOK", 25, "PATNA", "12:05-AM", "MUMBAI TO KANPUR", 54698, 9856.21);
                    ArrayList<passenger> list = new ArrayList<>();
                    list.add(p1);
                    list.add(p2);
                    String searchname = "ABC";
                    boolean found = false;
                    for (int i = 0; i <= 1; i++) 
                    {
                        passenger pm = list.get(i);
                        found = pm.SearchPassenger(searchname);
                        if (found == true) 
                        {
                            break;
                        }
                        else if (found == false) 
                        {
                            System.out.println(" ");
                        }
                    }
                    break;
                default:
                    System.out.println("INVALID INPUT!!!!!!!");
            }
            System.out.println("DO YOU WANT TO CONTINUE PRESS 1 FOR YES OTHER KEY FOR NO----- ");
            t = sc.nextInt();
        }
        while (t==1);
    }
}
