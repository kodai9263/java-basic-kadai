package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionary = new HashMap<>();
	
	public Dictionary_Chapter21(){
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public void dictionaryCheck(String english) {
		if(dictionary.containsKey(english)) {
			System.out.println(english+ "の意味は" +dictionary.get(english));
		}else {
			System.out.println(english+ "は辞書に存在しません");
		}
	}

}
