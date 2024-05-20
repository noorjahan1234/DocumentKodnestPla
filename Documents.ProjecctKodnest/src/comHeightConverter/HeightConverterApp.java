package comHeightConverter;

public class HeightConverterApp {

	public static void main(String[] args) {
		double hight=72;
		HeightConverter converter = new HeightConverter();
		System.out.println(converter.convertInchesToFeet(hight));

	}

}
