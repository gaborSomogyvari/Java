import java.util.Scanner;

class Test{
    public static void main(String args[]){

        /*Task Description:
        Write a program which reads from the user three non-negative integers and then
        prints, using symbols '*', a `histogram' of the data represented by the numbers, i.e.,
        three vertical bars, aligned at the bottom, with heights equal to the values of the
        three numbers.
        For example, for numbers 3, 1 and 8 the result should look like this:
        *
        *
        *
        *
        *
        * *
        * *
        ***
        Do not use arrays, strings or any other kind of collections.
        */      

        /*Discaimer:
        I am sorry for the redundant code, but I couldn't 
        use iteration for the data collection, nor while printing the results
        since the resctriction of not using strings 
        or any form of collections made the usage of iterations useless
        
        The code was written and tested in Visual Studio Code, for any 
        queries, please do not hesitate to contact me via email: somi.gabi.android@gmail.com*/ 

        //object to read user input
        Scanner obj = new Scanner(System.in);

        //read the user input into integers
        System.out.println("Please give me a natural number. (example: 1 or 2 or 3 etc.)");
        int a=obj.nextInt();
        System.out.println("Please give me another natural number. (example: 1 or 2 or 3 etc.)");
        int b=obj.nextInt();
        System.out.println("Please give me another natural number. (example: 1 or 2 or 3 etc.)");
        int c=obj.nextInt();

        obj.close();
        int maxInteger=Math.max(Math.max(a,b),c);

        //printing the histogram
        for(int i= maxInteger;i>0;i--){
            
            if(a%i==0){
                System.out.print("\n*");
                a--;
            }else{
                System.out.print("\n ");
            }
            if(b%i==0){
                System.out.print("*");
                b--;
            }else{
                System.out.print(" ");
            }
            if(c%i==0){
                System.out.print("*");
                c--;
            }else{
                System.out.print(" ");
            }
            
           
        }
        
    }   
}
