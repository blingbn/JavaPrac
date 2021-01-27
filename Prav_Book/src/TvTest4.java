
	public class TvTest4 {

		public static void main(String[] args) {
			
			Tv [] TvArr = new Tv[3];
			
			for(int i=0; i<TvArr.length; i++) {
				TvArr[i] = new Tv();
				TvArr[i].channel = i+10;
			}
			for(int i=0; i<TvArr.length; i++) {
				TvArr[i].channelUp();
				System.out.printf("tvArr[%d].channel=%d%n",i,TvArr[i].channel);
			}
	
			
		}

	}
	