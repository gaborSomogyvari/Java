class Box{

    private String name;
    private Product prod;

    public String get_name(){
        return this.name;
    }
    public Product get_prod(){
        return this.prod;
    }

    public Box(String name,Product prod){
        this.name=name;
        this.prod=prod;
    }
    public static Product[] getProducts(Box[] boxes){
        //creates and returns an array of products contained in the boxes
        
        Product[] returnArray=new Product[boxes.length];
        for(int i=0;i<boxes.length;i++){
            returnArray[i]=boxes[i].get_prod();
        }
        return returnArray;
    }
    public static String[] boxNames(Box[] boxes, int minimum_price, int maximum_price){
        /*creates and returns an array of names (name) of the boxes,
        but only those which contain a product with its price not less than given minimum value and not greater than the maximum (the function returns null if
        there is no box meeting the criterion) */

        boolean empty=true;
        String[] returnArray=new String[boxes.length];

        for(int i=0;i<boxes.length;i++){
            int priceHhelper=boxes[i].get_prod().get_price();
            if(priceHhelper<=maximum_price && priceHhelper>minimum_price){
               returnArray[i]=boxes[i].get_name(); 
               empty=false;
            }  
        }

        if(empty==false){
           return returnArray; 
        }else{
            return null;
        }
        
    }

    @Override
    public String toString(){
        return "toString(): the name of the box is: "+this.name;
    }
}