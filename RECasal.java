import java.util.Scanner;
public class RECasal {
    static boolean ASAL(int num, int i){
        if(num==0 || num==1){
            return false;
        }
        if(num==2){
            return true;
        }
        else{
            if(num%i==0){
                if(i==1){
                    return ASAL(num,i+1);
                }else if(num==i){
                    return true;
                }else{
                    return false;
                }
            } else{
                return ASAL(num,i+1);
            }}}
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.print("Sayı giriniz : ");
        num=inp.nextInt();
        if(ASAL(num,1)){
            System.out.println(num + " Asaldır.");
        }else {
            System.out.println(num + " Asal değildir.");
        }
    }
}



