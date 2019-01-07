package Colin.vokt;

/*
 * Colin Vokt
 * 12/18
 */

public class TwoDimentions {

	public static void main(String[] args) {
		
		//int table[] [] = new int [10][20];
		int t,i;
		int table [] []= new int [3] [3];
		for (t=0; t < 3; ++t) {
			for(i=0; i<3; ++i) {
				table [t] [i] = (t*3)+i+1;
				System.out.print(table [t][i] + " ");
				
			}
			System.out.println();
		}
		
			String list[][] = new String[3][];
			list[0] = new String [2];
			list[1] = new String [3];
			list[2] = new String [2];
			list[0][0]= "Binding of Issac";  
			list[0][1]= "Binding of Issac: Rebirth"; 
			list[1][0]= "Captain American";
			list[1][1]= "Captain American: Winter Solider";
			list[1][2]= "Captain American: Civil War";
			list[2][0]= "Team Fortress";
			list[2][1]= "Team Fortress 2";
			System.out.println(list[1][1]);
	}

}
