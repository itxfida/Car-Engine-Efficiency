import java.util.Scanner;
public class lab_02 {



    public static void main(String[] args) {
        String car;
        double distance;
        double fuel_Consumed ;
        double pricePerLiter;
        double cost;
        double perLFC;
        
        System.out.println("Enter the car name");
        Scanner c=new Scanner(System.in);
        car=c.nextLine();
        
        System.out.println("Distance travelled by the car in Km");
        Scanner d=new Scanner(System.in);
        distance=d.nextDouble();
        
        System.out.println("Price per liter in rupees");
        Scanner ppl=new Scanner(System.in);
        pricePerLiter=ppl.nextDouble();
        
        System.out.println("Total fuel consumed in liters");
        Scanner obj=new Scanner(System.in);
        fuel_Consumed=obj.nextDouble();
       
        perLFC=(distance/fuel_Consumed);
        cost=fuel_Consumed*pricePerLiter;
        
        System.out.println("CAR                           : "+car);
        System.out.println("distace travelled             : "+distance);
        System.out.println("Fuel price per liter is       : "+pricePerLiter);
        System.out.println("Total fuel consumed in liters : "+fuel_Consumed);
        System.out.println("Per Km fuel consumption       : "+perLFC);
        System.out.println("The total cost in rupees is   : "+cost);

          
         if(perLFC>=20){
             System.out.println("Your car is highly fuel efficient");   
         }
         else 
            
          if(perLFC>=15 && perLFC<20){
             System.out.println("Your car is fuel efficient");  
         }
         else 

          if(perLFC<=15 && perLFC>10){
                 System.out.println("Your need to show your car to a mechanics");   
             }
         else 

          if(perLFC<10){
                 System.out.println("Your car need tuning");
                 }
                 else

                     System.out.println("invalid input");
                 
    }
    }
    

