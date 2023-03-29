import java.util.Scanner;

class Triangle {
	int pointX;
	int pointY;

	public Triangle(int pointX, int pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public int getPointX() {
		return pointX;
	}

	public int getPointY() {
		return pointY;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle[] tri = new Triangle[3];
		for (int i = 0; i < tri.length; i++) {
			int pointX = sc.nextInt();
			int pointY = sc.nextInt();
			tri[i] = new Triangle(pointX, pointY);
		}
		sc.close();

		Main main = new Main();
		double resultX = main.WeightPoint(tri, 'X');
		double resultY = main.WeightPoint(tri, 'Y');

		System.out.printf("(%.1f, %.1f)", resultX, resultY);
	}

	public double WeightPoint(Triangle tri[], char point) {
		double result = 0.0;

		if (point == 'X') {
			for (int i = 0; i < tri.length; i++) {
				result += tri[i].pointX;
			}
		} else if (point == 'Y') {
			for (int i = 0; i < tri.length; i++) {
				result += tri[i].pointY;
			}
		}

		result = result / 3;
		return result;
	}
}
