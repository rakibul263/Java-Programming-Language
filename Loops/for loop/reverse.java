import java.util.*;

class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ara = new int[n];
        for(int i=0;i<n;i++){
            ara[i] = sc.nextInt();
        }
        for(int i=n-1;i>0;i--){
            System.out.print(ara[i]+" ");
        }
    }
}