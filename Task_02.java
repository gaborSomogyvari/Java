import java.util.Scanner;



class Task_02{
    public static void main(String[] args) {

    /*Task Description: 
    Write a program which reads a string and then prints it surrounded by a frame
    consisting of asterisks and with width which matches the length of the string.
    For example, if the string is "Shakespeare", then the program should print
    *****************
    * *
    * Shakespeare *
    * *
    *****************
    Note: if str is the reference to a string, then str.length() is its length.
    */

    //we ask for an input and we save it with some whitespace aroud it
    Scanner obj=new Scanner(System.in);  
    System.out.println("Please type in a word!");
    String myInput=String.format(" %s ",obj.nextLine());
    int myInputLenght=myInput.length();
    obj.close();

    //iterating through the 5 rows
    for(int i=0;i<5;i++){

        //iterating through the lenght of the input +1 
        for(int j=0;j<=myInputLenght+1;j++){

            //first and last row should only contain *
            if(i==0 || i==4){
                System.out.print("*");
               } 

            //else we check in which column we are and print accordingly       
            else {
                if(j==0 || j==myInputLenght+1){
                System.out.print("*");
                }
                else if(i==2){
                    System.out.print(myInput.charAt(j-1));
                }
                else{
                System.out.print(" ");
                }     
            }      
        }System.out.println("");

    }
}
}