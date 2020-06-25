class bicycle{
	double seat_height;
	double tyre_diameter;
	int bicycle_speed;
	void show(){
		System.out.println("BICYLE DETAILS:");
		System.out.println("Seat height="+seat_height+"m");
		System.out.println("Tyre diameter="+tyre_diameter+"m");
		System.out.println("Bicycle speed="+bicycle_speed+"km");
	}
	}
	class bike extends bicycle{
		int bike_speed;
		void display(){
			System.out.println("BOTH BICYLE AND BIKE DETAILS:");
			System.out.println("Seat height="+seat_height);
			System.out.println("Tyre diameter="+tyre_diameter);
			System.out.println("Bicycle speed="+bicycle_speed);
		    System.out.println("Bike speed="+bike_speed);
		}
	}
	class Twowheeler{
		public static void main(String args[]){
			bike j=new bike();
			j.seat_height=0.65;
			j.tyre_diameter=0.5;
			j.bicycle_speed=30;
			j.bike_speed=140;
			j.show();
			j.display();
		}

	}
