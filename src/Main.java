import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int b=sc.nextInt();
            int i=0;
            int c=0;
            for(;i<n;i++){
                if(a[i]==b){
                    c++;
                    System.out.println(i);
                    break;
                }
            }
            if(c==0){
                System.out.println("-1");
            }
        }
    }
}
