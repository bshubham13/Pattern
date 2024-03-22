/* 
print the given pattern.

1 4 7 10
13 16 19 22
25 28 31 34
37 40 43 46

*/

class StarPattern6 {
	public static void main(String[] args) {

		int a = 1;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(a + " ");
				a = a + 3;
			}
			System.out.println();
		}

	}
}
