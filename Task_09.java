class Task_09{

    public static void main(String[] args) {
        
        Person[] persons=new Person[]{
            new Person("Gabor",1980), 
            new Person("John",1985),
            new Person("Magda",1960),       //oldest
            new Person("Josua",1990),
            new Person("Weronika",1999),    //youngest female
            new Person("Asia",1995),
            new Person("Piotr",2000),
            new Person("Marta",1982),
        };

        //testing constructor
        Person justname=new Person("Adam");
        print(String.valueOf(justname.getBirthYear()));

        //tesing isFemale
        Person femaleName=new Person("Marta");
        print(String.valueOf(femaleName.isFemale()));

        //testing getOlder
        Person older=Person.getOlder(new Person("Adam",1990), new Person("Eve",1880));
        print(older.getName());

        //testing getOldest
        Person oldest=Person.getOldest(persons);
        print(oldest.getName());

        //testing getYoungestFemale
        Person young_female=Person.getYoungestFemale(persons);
        print(young_female.getName());


    }
    static void print(String me){
        System.out.println(me);
    }


}