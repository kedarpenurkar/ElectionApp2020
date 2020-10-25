import java.util.*;
import java.lang.*;

public class Main {
    public static int no_people;
    public static int no_can;
    public static String v_name;
    public static String[] c_name = new String[100];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Election App 2020!");
        System.out.println("Please Enter your Village name : ");
        v_name=sc.nextLine();
        System.out.println("Village name : "+v_name);

        System.out.println("Please Enter Number of peoples in Village : ");
        no_people=sc.nextInt();
        System.out.println(+no_people+" people live in "+v_name+" village.");

        System.out.println("Please Enter Number of Candidates : ");
        no_can=sc.nextInt();


        System.out.println("Please Enter name of Candidates : ");
        for(int i=0;i<=no_can;i++){
            //System.out.println("Please Enter name of "+i+" Candidates :");
            c_name[i]=sc.nextLine();

        }
        for(int i=1;i<=no_can;i++){
            System.out.println("Name of "+i+" Candidate is : "+c_name[i]);

        }

        vote_checker();


    }

    public static void vote_checker(){
        System.out.println("\nCounting Started for Election 2020..\n");
        Random  r_no = new Random();
        int[] conter = new int[no_can];
        for(int k=0; k < conter.length;k++){
            conter[k]=0;
        }

        for (int i=0;i<no_people;i++){
            int c = r_no.nextInt(no_can);

            for (int j=0;j<no_can;j++){
                if (c == j){
                    conter[j]=conter[j]+1;
                }
            }

        }

        for(int k=0; k < conter.length;k++){
            System.out.println("Total no of votes for candidate "+c_name[k+1]+" is : "+conter[k]);
        }
        getLargest(conter);


    }

    public static void getLargest( int[] array )
    {

        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] > array[largest] ) {
                largest = i;
            }
        }

        //System.out.println("Largest Index is "+largest);

        System.out.println("\n Hurry..!! Election won by " +c_name[largest+1] );


    }

}
