package lambdalabassignmentsex3;


public class Password {

	public static void main(String[] args) {

		String name = "Harshavardhan";
		String pass = "harsha@1998";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Harshavardhan", "harsha@1998"));
	}
}