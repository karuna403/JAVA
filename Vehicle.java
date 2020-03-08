class Vehicle {
    public String vehicleModel;
    public String vehicleColor; 
     Vehicle(){}
     Vehicle(String vehicleModel, String vehicleColor){
        this.vehicleModel=vehicleModel;
        this.vehicleColor=vehicleColor;
    }
    public void SetVehicleModel(String vehicleModel){
        vehicleModel=vehicleModel;
    } 
    public String GetVehicleModel(){
        return vehicleModel; 
    }
    public String Giveresult(){
        return("color of given vehicle is:"+vehicleColor+"\n"+"Model of given vehicle is:"+vehicleModel);
    }
}
    class Car extends Vehicle{
      public int vehicleHeight;
        Car(){}
        Car(String vehicleModel, String vehicleColor, int vehicleHeight){
            super(vehicleModel, vehicleColor);
            this.vehicleHeight=vehicleHeight;
            
    }
    }
    class Truck extends Vehicle{
        public int vehicleNo;
        Truck(){}
        Truck(String vehicleModel, String vehicleColor, int vehicleNo){
            super( vehicleModel, vehicleColor);
            this.vehicleNo=vehicleNo;
            
        }
    } 
    public class Road{
    public static void main(String[] args){
        Car c=new Car("Maruthi","red", 50);
        Truck t=new Truck("Sujuki","blue", 700);
        System.out.println(c.vehicleHeight);
        System.out.println(t.GetVehicleModel());
    }
}
    
        
