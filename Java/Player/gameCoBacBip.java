package Player;
import java.lang.Math;
import java.util.Random;
public class gameCoBacBip {
    public static void main(String [] args){
        System.out.println("-----------------\nGame co bac bip");
        System.out.println("\3\4\5\6"); 
        String [] v= new String [4];
        v[0]="\3";
        v[1]="\4";
        v[2]="\5";
        v[3]="\6";
        Random rd = new Random();
        for(int i=0; i<3;i++){
            int nb= rd.nextInt(14);
            if(nb==0){
                nb+=1;
            }
            String n=String.valueOf(nb);
            System.out.print(n+v[rd.nextInt(4)]+" | ");
        }
        
    }
}
