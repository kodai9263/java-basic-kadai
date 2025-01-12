package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	Scanner scanner = new Scanner(System.in);
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		
		String hand;
		
		while(true) {
			hand = scanner.nextLine().trim();
			if(hand.equals("r") || hand.equals("s") || hand.equals("p")){
			    return hand;
		    }else {
		        System.out.println("正しいじゃんけんの手を入力してくだい");
		    }
		}
	}
	//対戦相手のジャンケンの手を乱数で選ぶ
	public String getRandom() {
		String[] pair = {"r","s","p"};
		double i;
		i = (Math.floor(Math.random() * 2));
		return pair[(int)i];
	}
	
	//じゃんけんを行う
	public void playGame() {
		HashMap<String,String> handMap = new HashMap<>(); 
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		String myHand = new String(getMyChoice());
		String pairHand = new String(getRandom());
		
		System.out.println("自分の手は" +handMap.get(myHand)+  ",対戦相手の手は" +handMap.get(pairHand));
		
		if(myHand.equals(pairHand)) {
			System.out.println("あいこです");
		} else if(
			myHand.equals("r") && pairHand.equals("s") ||
			myHand.equals("s") && pairHand.equals("p") ||
			myHand.equals("p") && pairHand.equals("r")) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
