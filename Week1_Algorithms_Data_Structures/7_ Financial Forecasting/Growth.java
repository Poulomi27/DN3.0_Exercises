class Growth{
    public static double pay(double current,double growth,int year){
        if(year==0)
        return current;
        else
        return(pay(current*(1+growth),growth,year-1));
    }
    public static void main(String agrs[]){
        double current=100;
        double growth=0.1;
        int year=5;
        double future_val=pay(current,growth,year);
        System.out.println("The future value is : "+future_val);
    }
}