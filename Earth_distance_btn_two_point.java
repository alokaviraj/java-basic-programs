import java.util.*;
public class Earth_distance_btn_two_point {

	public static void main(String[] args) {
		Earth e=new Earth();
		e.dis();

	}

}
class Earth{
	void dis() {
		Scanner ob=new Scanner(System.in);
		System.out.print("input the latitude of coordinate 1:");
		double lat1=ob.nextDouble();
		System.out.print("input the longitude of coordinate 1:");
		double lon1=ob.nextDouble();
		System.out.print("input the latitude of coordinate 2:");
		double lat2=ob.nextDouble();
		System.out.print("input the longitude of coordinate 2:");
		double lon2=ob.nextDouble();
		System.out.print("the distance:"+ distance_between_LatLong( lat1, lat2, lon1, lon2)+"km\n");
		
	}
	public static double distance_between_LatLong(double lat1,double lon1,double lat2,double lon2){
		lat1=Math.toRadians(lat1);
		lon1=Math.toRadians(lon1);
		lat2=Math.toRadians(lat2);
		lon2=Math.toRadians(lon2);
		
		double earthRadius=6371.01;
		return earthRadius*Math.acos((Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2))*Math.cos(lon1 - lon2));
		
}
}