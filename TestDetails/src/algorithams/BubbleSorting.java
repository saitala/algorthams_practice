package algorithams;

public class BubbleSorting {

	public int[] sortData(int[] data, int startIndex, int endIndex, int shuffleCounter) {
		while (startIndex != endIndex) {
			if (data[startIndex] > data[startIndex + 1]) {
				int temp = data[startIndex + 1];
				data[startIndex + 1] = data[startIndex];
				data[startIndex] = temp;
				shuffleCounter = shuffleCounter + 1;
			}
			startIndex++;
		}

		if (shuffleCounter > 0) {
			sortData(data, 0, endIndex - 1, 0);
		}

		return data;
	}

	public int[] sortData(int[] data) {
		return this.sortData(data, 0, data.length - 1, 0);
	}

	public static void main(String[] args) {
		int[] sortData = new BubbleSorting().sortData(new int[] { 3, 1, 5, 6, 4, 2 });
		for (int i : sortData) {
			System.out.print(i + ", ");
		}
	}

}
