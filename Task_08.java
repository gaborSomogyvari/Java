class Task_08{

    public static void main(String[] args) {
        /*In function main (in a separate class) create an array of boxes (containing products!)
        and test both functions.*/ 

        //products
        Product prod_1=new Product("tennisball",50);
        Product prod_2=new Product("football",100);
        Product prod_3=new Product("baseball",30);
        Product prod_4=new Product("pingpongball",15);
        Product prod_5=new Product("basketball",120);
        Product prod_6=new Product("poolball",80);

        Box box_test=new Box("testing box",new Product("testing product", 100));
        
        //array of boxes
        Box[] boxes=new Box[]{
            new Box("box_1",prod_1),
            new Box("box_2",prod_2),
            new Box("box_3",prod_3),
            new Box("box_4",prod_4),
            new Box("box_5",prod_5),
            new Box("box_6",prod_6),            
        };

        //testing the functions
        Product[] prods=Box.getProducts(boxes);
        String[] names=Box.boxNames(boxes,10,11);

        //printing the test results
        printStringArray(names);
        printProductArray(prods);

        //testing the toString method
        System.out.println(prod_1.toString());
        System.out.println(box_test.toString());

    }
    public static void printStringArray(String[] input){
        if(input==null){
            System.out.println("There are no products that mety the criteria");
            return;
        }
        for(int i=0;i<input.length;i++){
            if(input[i]!=null){
                System.out.println("The box which falls into the given range: "+input[i]);
            }        
        }
    }
    public static void printProductArray(Product[] input){
        for(int i=0;i<input.length;i++){
            System.out.println("The name of the product in the given box: "+input[i].get_name());
        }
    }
}
