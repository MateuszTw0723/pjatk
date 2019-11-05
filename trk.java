import java.util.Scanner;
public class trk{
    public static void main(String[] args){

        System.out.print("Podaj wartość n ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int tab[][]=new int[n][2*n-1];

        for( int i = 0; i<n;i++){
            if(i==0){
                for(int j = 0;j<2*n-1;j++){
                    if(j==n-1){
                        tab[i][j]=1;
                    }else{
                        tab[i][j]=0;
                    }
                }
            }else{
                for(int j = 0;j<2*n-1;j++){
                    if(j==0){
                        tab[i][j]=tab[i-1][j+1];
                    }else if(j==2*n-2){
                        tab[i][j]=tab[i-1][j-1];
                    }
                    else{
                        tab[i][j]=tab[i-1][j-1]+tab[i-1][j+1];
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j = 0;j<2*n-1;j++){
                if(tab[i][j]==0){
                    System.out.print(" ");
                }else{
                    System.out.print(tab[i][j]);
                }
            }
            System.out.println("");
        }
    }
}