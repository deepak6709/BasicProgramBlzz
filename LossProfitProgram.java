package Com.Basic;

import java.util.Scanner;

public class LossProfitProgram {

	public static void main(String[] args) {

		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter The selling Price");
		
		double sellPrice=x.nextDouble();
		
        System.out.println("Enter The Buying Price");
		
		double BuyingPrice=x.nextDouble();
		
		if(sellPrice>BuyingPrice) {
			
			double profit=sellPrice-BuyingPrice;
			
			double profitPercentage=(profit/BuyingPrice)*100;
			
			System.err.println(profitPercentage+ "% profit");
			
			
			
		}
		else if(sellPrice<BuyingPrice) {
			
			double loss=sellPrice-BuyingPrice;
			
			double lossPercentage=(loss/BuyingPrice)*100;
			
			System.out.println(lossPercentage+"% loss");
			
		}
		else {
			
			
			System.out.println("No profit no loss");
		}
		
	}

}
