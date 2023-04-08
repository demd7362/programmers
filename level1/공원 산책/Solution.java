import java.util.*;
class Coordinate {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void plusX() {
		x++;
	}
	public int getY() {
		return y;
	}
	public void minusY() {
		y--;
	}
	public void minusX() {
		x--;
	}
	public void plusY() {
		y++;
	}
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
    public boolean equals(Coordinate coordinate) {
		return this.x == coordinate.x && this.y == coordinate.y;
	}
}
class Solution {
    private static List<Coordinate> wallList = new ArrayList<>();
	
	public static boolean wallChecker(Coordinate coordinate) {
		for(Coordinate wallPosition : wallList) {
			if(wallPosition.equals(coordinate)) return true;
		}
		return false;
	}
    public int[] solution(String[] park, String[] routes) {
        Coordinate coordinate = null;
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				char value = park[i].charAt(j);
				if (value == 'S') {
					coordinate = new Coordinate(i, j);
				} else if (value == 'X') {
					wallList.add(new Coordinate(i, j));
				}
			}
		}
		loop: for (String route : routes) {
			String[] targets = route.split(" ");
			String direction = targets[0];
			int distance = Integer.parseInt(targets[1]);
			Coordinate tmp = new Coordinate(coordinate.getX(), coordinate.getY());
			switch (direction) {
			case "N":
				for (int i = 0; i < distance; i++) {
					coordinate.minusX();
					if (coordinate.getX() < 0 || wallChecker(coordinate)) {
						coordinate = tmp;
						continue loop;
					}
				}
				break;
			case "S":
				for (int i = 0; i < distance; i++) {
					coordinate.plusX();
					if (coordinate.getX() >= park.length || wallChecker(coordinate)) {
						coordinate = tmp;
						continue loop;
					}
				}
				break;
			case "W":
				for (int i = 0; i < distance; i++) {
					coordinate.minusY();
					if (coordinate.getY() < 0 || wallChecker(coordinate)) {
						coordinate = tmp;
						continue loop;
					}
				}
				break;
			case "E":
				for (int i = 0; i < distance; i++) {
					coordinate.plusY();
					if (coordinate.getY() >= park[0].length() || wallChecker(coordinate)) {
						coordinate = tmp;
						continue loop;
					}
				}
			}
		}
        return new int[]{coordinate.getX(),coordinate.getY()};
    }
}
