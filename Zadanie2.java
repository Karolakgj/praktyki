import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zadanie2 {
    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iloscWypelnieniaTablicy =0;
        final int MAXSIZE = 100000;
        int[] tmp2 = new int[MAXSIZE];

        try {
            String test =   reader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(test);
            while(stringTokenizer.hasMoreTokens()){
                tmp2[iloscWypelnieniaTablicy] = Integer.parseInt(stringTokenizer.nextToken());
                iloscWypelnieniaTablicy++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < iloscWypelnieniaTablicy - 1; i++) {
            for (int j = 0; j < iloscWypelnieniaTablicy - 1; j++) {
                if (tmp2[j] > tmp2[j + 1]) {
                    int temp = tmp2[j];
                    tmp2[j] = tmp2[j + 1];
                    tmp2[j + 1] = temp;
                }
            }
        }


        System.out.println("zadanie 2 ");
        for (int i = 0; i < iloscWypelnieniaTablicy; i++){
            for(int j=i +1 ;  j < iloscWypelnieniaTablicy; j++){
                if (tmp2[i]+tmp2[j] == 13){
                    System.out.println(tmp2[i]+" " +tmp2[j]);

                }
            }
        }
    }
}
