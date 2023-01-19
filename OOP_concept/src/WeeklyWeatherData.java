
public class WeeklyWeatherData {

	public static void main(String[] args) {
		static int NUMDAYS = 7;
		private double[] rainFall = new double[NUMDAYS];
		private double[] avgPressure = new double[NUMDAYS];
		private double avgRain;
		private double maxRain;
		
		public void setData(double[]rain,double[] pressure) {
			rainFall = rain;
			avgPressure = pressure;
		
		}
		
		public void calculateStatus() {
			maxrain = 0.0;
			double rainSum = 0.0;
			
			for (int i = 0; i < rainFall.length; i++) {
				if(rainFall[i] >= maxRain) {
					maxRain = rainFall;
				}
			}
			avgRain = rainSum/ NUMDAYS;
			
		}
		public double getAVGRain() {
			return avgRain;
			
		}
		public double getMaxRain() {
			return 
		}

	}

}
