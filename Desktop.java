package org.Systems;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("The desktop size is 32 inches");
	}

	public static void main(String[] args) {
		Desktop configure = new Desktop();
		configure.desktopSize();
		configure.computerModel();
	}
}
