class TimeSpan {
	public int hours;
	public int minutes;
	
	//constructor
	public TimeSpan(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	//add the inputed hours and minutes to the current span
	public void add(int hours, int minutes) {
		this.hours += hours;
		this.minutes += minutes;
	}

	//add a different object's span to the current span
	public void add(TimeSpan newTimeSpan) {
		this.hours += newTimeSpan.hours;
		this.minutes += newTimeSpan.minutes;
	}

	//return the value as a decimal
	public double getTotalHours() {
		return (this.hours + this.minutes / 60.0);
	}
	
	//turns the hours and time to a string;
	public String toString() {
		this.hours = (int) this.getTotalHours(); //just get the whole number
		this.minutes = this.minutes % 60; 
		return this.hours + "h" + this.minutes + "m";
	}
}