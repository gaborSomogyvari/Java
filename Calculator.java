class Calculator extends CalculatingDevice{
    
    public Calculator(String name){
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + String.format("%s - %s = %s; ",x,y,x-y);
    }
}