package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 englishDictionary = new Dictionary_Chapter21();
		
		String [] checkEnglish = {"apple", "banana", "grape", "orenge"};
		
		for(String japanese : checkEnglish) {
			englishDictionary.dictionaryCheck(japanese);
		}

	}

}
