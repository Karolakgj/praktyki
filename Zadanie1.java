import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zadanie1 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iloscWypelnieniaTablicy =0;
        final int MAXSIZE = 100000;
        int[] tmp = new int[MAXSIZE];
        try {
          String test =   reader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(test);
            while(stringTokenizer.hasMoreTokens()){
                tmp[iloscWypelnieniaTablicy] = Integer.parseInt(stringTokenizer.nextToken());
                iloscWypelnieniaTablicy++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        int counter=1;
        for (int i = 0; i < iloscWypelnieniaTablicy - 1; i++) {
            for (int j = 0; j < iloscWypelnieniaTablicy - 1; j++) {
                if (tmp[j] > tmp[j + 1]) {
                    int temp = tmp[j];
                    tmp[j] = tmp[j + 1];
                    tmp[j + 1] = temp;
                }
            }
            counter++;
        }
        System.out.println("zadanie 1:");
        System.out.println();
        System.out.println("Posortowana tablica: ");
        for(int i = 0; i < iloscWypelnieniaTablicy; i++) System.out.print(tmp[i] + " ");


        int distinctCounter =0;


        for(int i = 1; i < iloscWypelnieniaTablicy; i++){

            if(tmp[i-1] == tmp[i]){
                distinctCounter++;
            }
        }
        System.out.println();
        System.out.println("Counter: "+counter);
        System.out.println("Distinct : "+(iloscWypelnieniaTablicy-distinctCounter));
        System.out.println("min: "+tmp[0]);
        System.out.println("max: "+tmp[iloscWypelnieniaTablicy -1]);


    }
}
