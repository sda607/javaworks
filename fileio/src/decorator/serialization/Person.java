package decorator.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long SerialVerstionUID = 10000000L;
	
	private String name;
	private String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + job;
	}
	
	
}
