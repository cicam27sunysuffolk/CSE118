package p3;

public class Classroom {
	String roomNumber;
	int roomCapacity;
	boolean hasProjector;
	
	public Classroom(String aRoomNumber) {
		roomNumber = aRoomNumber;
		roomCapacity = 11110;
		hasProjector = true;
	}
	
	public Classroom(String aRoomNumber, int aRoomCapacity) {
		roomNumber = aRoomNumber;
		roomCapacity = aRoomCapacity;
		hasProjector = false;
	}
	
	public Classroom(String aRoomNumber, int aRoomCapacity, boolean projector) {
		roomNumber = aRoomNumber;
		roomCapacity = aRoomCapacity;
		hasProjector = projector;
	}
	
	public void setRoomNumber(String newRoomNumber) {
		roomNumber = newRoomNumber;
	}
	
	public void setRoomCapacity(int newCapacity) {
		roomCapacity = newCapacity;
	}
	
	public void setProjector(boolean projector) {
		hasProjector = projector;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public int getRoomCapacity() {
		return roomCapacity;
	}
	
	public boolean getProjector() {
		return hasProjector;
	}

}
