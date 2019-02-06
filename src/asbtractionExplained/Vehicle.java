package asbtractionExplained;

public abstract class Vehicle extends Object   // For C# class Vehicle : Object 
    {
        static int vehicleCount = 0;

         int doors;
         int speed;
        String color;

        public abstract void run();
        
        public abstract void hasEngine();
        
        public  void test() {
        	System.out.println("The Vehicle::test() called");
		}
        
        
        public Vehicle()
        {
            //		System.out.println("A vehicle object is created");
            vehicleCount++;
            System.out.println("Vehicle(s) created: " + vehicleCount);

        }

        public Vehicle(int doors, int speed, String color)
        {
            this.doors = doors; this.speed = speed; this.color = color;

        }

/*        public override string ToString()
        {
           return base.ToString();

        //    return Console.WriteLine("The fields are" + this.doors + "  " + this.speed + "  " + this.color);
        }
*/
        public int getDoors()
        {  // Getter -> ret
            return doors;
        }

        public void setDoors(int doors)
        {
            this.doors = doors;
        }

        public int getSpeed()
        {
            return speed;
        }

        public void setSpeed(int speed)
        {
            this.speed = speed;
        }

        public String getColor()
        {
            return color;
        }

        public void setColor(String color)
        {
            this.color = color;
        }


    }
	

