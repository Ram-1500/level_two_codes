
public class TotalCubes {
	
	
	static int calculate_total_cube(int side,int painted_sides)
	{
		int total=0;
		if(painted_sides==3)
		{
			total=8;
			System.out.println(total);
		}
		else if(painted_sides==2)
		{
			
			total=12*(side-2);
			System.out.println(total);
		}
		else if(painted_sides==1)
		{
			
			total=(int) (6*Math.pow((side-2),2));
			System.out.println(total);
		}
		else if(painted_sides==0)
		{
			total=(int)Math.pow(side-2, 3);
			System.out.println(total);
		}
		
		return total;
	}

	public static void main(String[] args) {
		calculate_total_cube(8,1);
		
	}

}
