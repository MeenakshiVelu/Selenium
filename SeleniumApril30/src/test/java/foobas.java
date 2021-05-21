import java.util.HashMap;

public class foobas {

	public static void main(String[] args) {
		System.out.println("Values");
		System.out.println(solution("code"));

	}

	public static String solution(String s) {
		String op="";
		HashMap<String, String> alphabets = new HashMap<String, String>();

		alphabets.put("a", "100000");
		alphabets.put("b", "110000");
		alphabets.put("c", "100100");
		alphabets.put("d", "100110");
		alphabets.put("e", "100010");
		alphabets.put("f", "110100");
		alphabets.put("g", "110110");
		alphabets.put("h", "110010");
		alphabets.put("i", "011000");
		alphabets.put("j", "010110");
		alphabets.put("k", "101000");
		alphabets.put("l", "111000");
		alphabets.put("m", "101100");
		alphabets.put("n", "101110");
		alphabets.put("o", "101010");
		alphabets.put("p", "111100");
		alphabets.put("q", "111110");
		alphabets.put("r", "111010");
		alphabets.put("s", "011100");
		alphabets.put("t", "011110");
		alphabets.put("u", "101001");
		alphabets.put("v", "111001");
		alphabets.put("w", "010111");
		alphabets.put("x", "101101");
		alphabets.put("y", "101111");
		alphabets.put("z", "101011");
		alphabets.put(" ", "000000");

		for(int i=0;i<s.length();i++) {
			for (String j: alphabets.keySet()) {
				System.out.println(s.charAt(i));
				//System.out.println(alphabets.get(i));

				if(Character.isUpperCase(s.charAt(i) )) {
					System.out.println("hhhhh");
					//op.concat("000001");
					op=op+"000001";

					op.concat(alphabets.get(j));


				}
				else {
					op.concat(alphabets.get(i));


				}

			}
			for (String j: alphabets.keySet()) {
				//System.out.println("key: " + j + " value: " + alphabets.get(j));

			}
		}

		return op;


	}
}
