package kataProject;

public class Main {
	
	public static final void main(String... args) {

        NumberChecker object = new NumberChecker();

        for (int j = 1; j <= 100; j++) {
            System.out.println(object.encrypt(j));
        }
    }
}
