import java.util.Scanner;

class Task_03{
    public static void main(String[] args){

        /*Task Description:
        Write a program which reads an odd natural number n and writes on the console
        a symmetric ‘kite’ consisting of asterisks: in the first line n stars, in the second line
        n − 2 stars, . . . , in n-th – one star. For example, for n = 7 the output should look
        like this:
        *******
         *****
          ***
           *
        */

        Scanner scanner=new Scanner(System.in);
        print("Please give me an odd number");
        int x=scanner.nextInt();
        int currentX=x;
        scanner.close();

        //we iterate through the lines of the piramid
        for(int i=0;i<=(int)(x/2);i++){

            //we define how much space is needed before and after
            int zero=(x-currentX)/2;
            
            //at the beginning and at the end we print space
            for(int j=0;j<zero;j++){
                print(" ");
            }
            for(int j=0;j<currentX;j++){
                print("*");
            }
            for(int j=0;j<zero;j++){
                print(" ");
            }

            currentX-=2;
            print("\n");

        }
    }
    public static void print(String message){
        System.out.print(message);
    }
}