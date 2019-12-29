class Product{
    private String name;
    private int price;

    public String get_name(){
        return this.name;
    }
    public int get_price(){
        return this.price;
    }

    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return "toString(): the name of the product is: "+this.name;
    }
}