package Project;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public abstract class Access implements Application {
    protected static String pinCodes= "123";
    protected static String motherName = "Lan";
    protected static String fatherName = "Thanh";
    protected static int family = 5;
    protected LocalDateTime currentTime = LocalDateTime.now(ZoneId.of("Asia/Da_Nang"));
    protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    protected String formattedTime = currentTime.format(formatter);
    protected static ArrayList<Shop> ShopList= new ArrayList<>();
    protected static ArrayList<String> cusPwList= new ArrayList<>();
    protected static ArrayList<String> cusNameList= new ArrayList<>();
    protected static ArrayList<Customer> cusList= new ArrayList<>();
    
    
    protected static Scanner inp= new Scanner(System.in);

//abstract methods
    public abstract void add();
    public abstract void remove();
    public abstract void change();
    public abstract void showList();
}
