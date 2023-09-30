package Project;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Customer extends Access{
    public String cusName;
    public String cusPassword;
    public double totalPrice;
    public ArrayList<Integer> orderList = new ArrayList<>();
    public ArrayList<Shop> orderShopList = new ArrayList<>();
    public ArrayList<LocalDateTime> timeList = new ArrayList<>();

    public Customer(){
        System.out.print("Enter customer name:");
        cusName= inp.nextLine();
        System.out.print("Enter password:");
        cusPassword= inp.nextLine();
        Access.cusNameList.add(cusName);
        Access.cusPwList.add(cusPassword);
    }

    public static int logIn(String cusName, String cusPw){
        int check=-1;
        for (int i=0;i<Access.cusNameList.size(); i++){
            if(Access.cusNameList.get(i).equals(cusName) && Access.cusPwList.get(i).equals(cusPw)){
                check=i;
                break;
            }
        }
        return check;
        
    }
    public void add(){
        System.out.println("----------SHOP LIST----------");
        for(int i=0;i<ShopList.size();i++){
            System.out.println("Shop number: "+(i+1)+"| Shop Name: "+ShopList.get(i).shopName+"| Category: "+ShopList.get(i).category);
        }
        System.out.print("------------------------\nEnter number of the shop: ");
        int n=inp.nextInt();
        if(n<=ShopList.size()){
            Access.ShopList.get(n-1).showList();
            System.out.print("------------------------\nEnter number of the item: ");
            int i=inp.nextInt();
            if(i<=ShopList.get(n-1).listItem.size()){
                totalPrice+=Access.ShopList.get(n-1).priceList.get(i-1);
                orderList.add(i-1);
                orderShopList.add(Access.ShopList.get(n-1));
                
            }
            else{System.out.println("Invalid input! You are cancelled!\n---------------------------");}
        }
        else{System.out.println("Invalid input! You are cancelled!\n---------------------------");} 
    }
    
    public void remove(){
        System.out.println("--------------ORDER LIST--------------");
        for(int i=0;i<orderList.size();i++){
            System.out.println("Order "+(i+1)+"| Name: "+orderShopList.get(i).listItem.get(orderList.get(i))+"| Shop: "+orderShopList.get(i).shopName);
        }
        System.out.println("--------------------------------------");
        System.out.print("Enter the number of the remove order: ");
        int oi=inp.nextInt();
        orderList.remove(oi-1);
        orderShopList.remove(oi-1);
        inp.nextLine();
    }
    
    public void showList(){
        System.out.println("--------------ORDER LIST--------------");
        for(int i=0;i<orderList.size();i++){
            System.out.println("Order "+(i+1)+"| Name: "+orderShopList.get(i).listItem.get(orderList.get(i))+"| Shop: "+orderShopList.get(i).shopName);
        }
        System.out.println("--------------------------------------");
    }
    public void change(){
        inp.nextLine();
        System.out.print("Enter name again: ");
        String name=inp.nextLine();
        System.out.print("Enter the old password: ");
        String oPW=inp.nextLine();
        System.out.print("Enter new password: ");
        Access.cusPwList.set(Customer.logIn(name, oPW),inp.nextLine());
        System.out.println("Change password successful!\n-------------------------------");
    }   
}
