class CalculatingDevice{

    String name;

    public CalculatingDevice(String name){
        this.name=name;
    }
    public String calculate(double x, double y){
        //return name+": "+String.valueOf(x+y)+String.valueOf(x+y);
        return String.format("%s: %s + %s = %s; ", this.name,x,y,x+y);
    }
    public static void printRes(CalculatingDevice[] a,double x, double y){
        for(CalculatingDevice i : a) {
            System.out.println(i.calculate(x, y));
        }
    }

}