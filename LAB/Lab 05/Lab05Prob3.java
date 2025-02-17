class Point{
	
	private int x;
	private int y;
	
	// constructors
	
	
	
	// getters and setters
	
	
	// toString
	
	
	//findDistance
	public double findDistance(Point p){
		this.x p.x this.y p.y
		
	}
}

class Lab05Prob3{
	public static void main(String[] args){
		
		// array
		Point[] P = new Point[4];
		
		for(int .......){
			int x = input.nextInt();
			int y = ...............;
			P[i] = new Point(x,y);
		}
		
		Point referenceObject = new Point (0,0);
		............. = furthestPoint(P, referenceObject);
		System.out.println(............);
		
	}
	
	public static Point furthestPoint(Point[] points, Point p){
		double max = 0;
		int maxIndex = 0;
		for(int i = 0; ...............){
			double distance = points[i].findDistance(p);
			if(distance > max){
				max = .............;
				maxIndex = .........;
				
			}
		}
		return .............;
	}
		
		
	}