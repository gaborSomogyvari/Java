class Computer extends Calculator{
    public Computer(String name){
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + String.format("%s * %s = %s; %s * %s = %s ",x,y,x*y,x,y,x/y);
    }
} 