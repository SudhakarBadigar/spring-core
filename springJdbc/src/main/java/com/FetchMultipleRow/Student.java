package com.FetchMultipleRow;

	public class Student {
		private String usn;
		private String name;
		private String city;

		public Student() {
			super();
		}

		public Student(String usn, String name, String city) {
			super();
			this.usn = usn;
			this.name = name;
			this.city = city;
		}

		public String getUsn() {
			return usn;
		}

		public void setUsn(String usn) {
			this.usn = usn;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Student [usn=" + usn + ", name=" + name + ", city=" + city + "]";
		}
	}

