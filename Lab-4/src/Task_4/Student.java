package Task_4;
public class Student {
		private int rollnumber;
		protected char grade;
		public String name;
		public void setdetails(int rollnumber,char grade,String name) {
			this.rollnumber=rollnumber;
			this.grade=grade;
			this.name=name;
		}
		public void showdetails() {
			System.out.println("Roll number: "+rollnumber);
			System.out.println("Grade: "+grade);
			System.out.println("Name: "+name);
		}
	}