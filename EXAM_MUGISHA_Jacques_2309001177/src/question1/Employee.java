package question1;

 
public class Employee {
    private int id;
    private String name;
    private String position;

    // Constructor
    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.setPosition1(position);}

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

	public String getPosition1() {
		return position;
	}

	public void setPosition1(String position) {
		this.position = position;
	}

    public String getPosition() {
        return position;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}



