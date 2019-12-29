class Task_07{

    public static void main(String[] args){
        
        /*print(norm("tHis"));
        print(init("lava bubble hot"));
        print(init("lava hot"));
        print(tr("thisisit","is","OW"));*/

        System.out.println(norm("caravaggio"));
        print("Should return: Caravaggio");

        System.out.println(norm("VERMEER"));
        print("Should return: Vermeer");

        System.out.println(init("johann sebastian bach"));
        print("Should return: J. S. Bach");

        System.out.println(init("i. babeL"));
        print("Should return: I. Babel");

        System.out.println(init("jorge LUIS BORGES"));
        print("Should return: J. L. Borges");

        System.out.println(init("WOLFGANG a. mozart"));
        print("Should return: W. A. Mozart");

        System.out.println(tr("November 2016",
        "abcdefghijklmnopqrstuvwyz",
        "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        print("Should return: NOVEMBER 2016");

        System.out.println(tr("abcXYZ","aZcX","||Cx"));
        print("Should return: |bCxY|");
    }
    public static String norm(String name){
        String returnString="";
        for(int i=0;i<name.length();i++){
            if(i==0){
                returnString+=name.toUpperCase().charAt(i);
            }
            else{
                returnString+=name.toLowerCase().charAt(i);
            }
        }
        return returnString;
    }
    
    public static String init(String name){
        String returnString="";
        String[] splittedName=name.split(" ");

        for(int i=0;i<splittedName.length;i++){

            if(splittedName.length==2 && i==0 || splittedName.length==3 && i<=1){
                returnString+=splittedName[i].toUpperCase().charAt(0)+". ";
            }
            else{
                returnString+=norm(splittedName[i]);
            }
        }
        return returnString;
    }
    
    public static String tr(String s, String from, String to){

      String returnString="";
      for(int i=0;i<s.length();i++){
          try {
              //isPresent => finds the caracter in from* and returns its place
              //if returns null, we know it does not exists in from*
              //if returns a number, we attach the caracter from to*
              returnString+=to.charAt(isPresent(s.charAt(i),from));
          } catch (Exception e) {
              //if the caracter doesnt exists in from*, we just attach the next caracter from s*
              returnString+=s.charAt(i);
          }
      }
      return returnString;
    
    }
    
    public static void print(String input){
        System.out.println(input);
    }
    
    public static void printC(Character input){
        System.out.println(input);
    }
    
    public static int isPresent(Character c,String inThis){
        Integer returnInt=null;
        for(int i=0;i<inThis.length();i++){
            if(c==inThis.charAt(i)){
                returnInt=i;
            }
        }
        return returnInt;
    }

}