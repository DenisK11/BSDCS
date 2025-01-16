package DataOnly;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Overriding clone() method of Object class
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
	public String Model;
	public String Number;
	public List<String> Targets;
	public Boolean isBus;
	public Boolean isPriority;

	public Car(String Model, String Number, ArrayList<String> Targets, Boolean isBus, Boolean isPriority) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		this.Targets.addAll(Targets);
		this.isBus = isBus;
		this.isPriority = isPriority;
	}

	public Car(String Model, String Number, String[] Targets, Boolean isBus, Boolean isPriority) {
		this.Model = Model;
		this.Number = Number;
		this.Targets = new ArrayList<String>();
		for (String string : Targets) {
			this.Targets.add(string);
		}
		this.isBus = isBus;
		this.isPriority = isPriority;
	}

	public String toString() {
		return Model + "-" + Number;
	}
};

