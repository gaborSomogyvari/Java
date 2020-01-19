class Person{

    private String name;
    private int birth_day;

    public String getName(){return this.name;}
    public int getBirthYear(){return this.birth_day;}

    public Person(String name){
        this(name,1990);
    }
    public Person(String name, int birth_day){
        this.name=name;
        this.birth_day=birth_day;
    }

    public boolean isFemale(){
        
        if(this.name.charAt(this.name.length()-1)=='a'){
            return true;
        }else{
            return false;
        }
    }
    //comment: and what if they are the same age?
    static Person getOlder(Person p1,Person p2){
        if(p1.getBirthYear()<p2.getBirthYear()){
            return p1;
        }else{
            return p2;
        }
    }
    
    static Person getOldest(Person[] persons){
        Person oldest=persons[0];
        for(int i=1;i<persons.length;i++){
            if(oldest.getBirthYear()>persons[i].getBirthYear()){
                oldest=persons[i];
            }
        }
        return oldest;
    }
    
    static Person getYoungestFemale(Person[] persons){
        Person youngest=null;
        for(int i=0;i<persons.length;i++){
            if(youngest==null && persons[i].isFemale()){
                youngest=persons[i];
            }
            if(youngest!=null && youngest.getBirthYear()<persons[i].getBirthYear() && persons[i].isFemale()){
                youngest=persons[i];
            }
        }
        return youngest;
    }
    @Override
    public String toString(){
        return "the preson name is: "+this.name;
    }
}