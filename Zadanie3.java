import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zadanie3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iloscWypelnieniaTablicy =0;
        int[][] tmp = new int[0][];
        int maxsize = 0;
        
        try {
            String maxsizes =   reader.readLine();
            maxsize = Integer.parseInt(maxsizes);
            tmp = new int[maxsize][2];
           
            for(int i = 0 ; i < maxsize;i++){
                String pair = reader.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(pair);
                while(stringTokenizer.hasMoreTokens()){
                    tmp[i][0] = Integer.parseInt(stringTokenizer.nextToken());
                    tmp[i][1] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
          

        } catch (IOException e) {
            e.printStackTrace();
        }

        


        int count =0;

        for(int i  = 1; i < maxsize;i++){
            for(int j =0; j <=1;j++){
                if (tmp[i - 1][j]  == (tmp[i][j] +1) || tmp[i - 1][j]  == (tmp[i][j] -1) ) {
                    count++;
                }


            }

        }
        System.out.println(count);
        
        
        

    }
}
