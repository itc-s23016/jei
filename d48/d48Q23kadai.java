// s23016
// d48Q23のコードのコンパイルエラーを修正

class d48Q23kadai {
	public static void main(String[] args) {
		int i = 1;
		for (;;) {
			i = i + 3;
			if (i < 10) {
				System.out.println(i);
				continue;
			} else {
				break;
			}
		}
	}
}
