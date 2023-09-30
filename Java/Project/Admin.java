package Project;

public class Admin extends Access {
    private String adminName;
    private String pinCode;
    private String motherName;
    private String fatherName;
    private int family;

    public Admin(){
        System.out.print("Enter your name: ");
        adminName=inp.nextLine(); 
        int count = 0;
        while (count < 3) {
        System.out.print("Enter the pin code: ");
        pinCode=inp.nextLine();
        if (pinCode.equals(Access.pinCodes)) {
            break;
        } else {
            count++;
            System.out.println("Incorrect pincode. Please try again.");
        }
    }
        if(count==3){
            System.out.println("------------------------------------\nYou have entered the wrong pincode too many times.");
            System.out.println("Please answer the following security question to reset your pincode:");
            System.out.print("1.What is your mother's name? ");
            motherName = inp.nextLine();
            System.out.print("2.What is your father's name? ");
            fatherName = inp.nextLine();
            System.out.print("3.How many people are there in your family? ");
            family = inp.nextInt();
            System.out.println("Your password has been reset. Please use the new password to log in.");
            if(motherName.equals(Access.motherName) && fatherName.equals(Access.fatherName) && family==Access.family){
                System.out.println("Your pin code : "+Access.pinCodes);
                pinCode=Access.pinCodes;
            }else{
                System.out.println("Login unsuccessful. You are cancelled");
            }
        }
        }

    public boolean Verify(){
        boolean check=false;
            if(this.pinCode.equals(Access.pinCodes)){
                check=true;}
        return check;
        }

    public void change(){
        System.out.print("Enter the new pin code: ");
        // if(inp.hasNextLine()) inp.nextLine();
        String pc=inp.nextLine();
        Access.pinCodes=pc; 
        System.out.println("Change pincode successful\n-----------------------------");
    }

    public void add(){
        Shop s= new Shop();
        Access.ShopList.add(s);
        System.out.println("-----------------------------");
    }
    public void remove() {
    boolean check=false;
        System.out.print("Enter name of the shop: ");
        String s=inp.nextLine();
        for(int i=0;i<Access.ShopList.size();i++){
            if(Access.ShopList.get(i)!=null && Access.ShopList.get(i).shopName.equals(s)){
                check=true;
                Access.ShopList.remove(Access.ShopList.get(i));
            }           
        }
        if(check==false) System.out.println("The name shop is not exist!");
        System.out.println("-----------------------------");     
    }
    public void showList(){
        System.out.println("----------SHOP LIST----------");
        for(int i=0;i<Access.ShopList.size();i++){
            if(Access.ShopList.get(i)!=null){
            System.out.println("Shop number: "+(i+1)+"\nShop Name: "+Access.ShopList.get(i).shopName+"\nCategory: "+Access.ShopList.get(i).category+"\n-------------------------");
            }
        }
        System.out.println("-----------------------------");
    }
}
