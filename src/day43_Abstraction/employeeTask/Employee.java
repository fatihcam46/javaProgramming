package day43_Abstraction.employeeTask;
    /*    Employee task:		abstract Person:			name, age, gender(final)
			eat();			sleep();
		abstract Employee extends Person:
			 id(final), jobTitle, salary...
			work();
		Tester			work(): testing
		Developer		work(): developing
		Teacher			work(): teaching
		Driver			work(): driving
     */
//parent class>>Employee>>Person
//add here >>abstract
    public abstract class Employee extends Person{
//1-id  ,jobTitle,salary>>create,
        private final int id;
        private String jobTitle;
        private double salary;
//4-constructor
        public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
            super(name, age, gender);
            if(id <= 0){ //add here negative>>RuntimeException
                throw new RuntimeException("Invalid ID: "+id);
            }
            this.id = id;
            setJobTitle(jobTitle);//change setter
            setSalary(salary);//change
        }
//3-getter and setter>>>right click>>generate>>getter setter
        public int getId() {
            return id;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

//2-work>>create>>but it is abstract>>method without body>>it will be change>>child classes
        //if you add abstracthere>>add here>>public abstract class Employee extends Person{
        public abstract void work();
//5-toString
        public String toString() {
            return "Employee{" +
                    "name=" + getName() + //add getName>>
                    ", age=" + getAge() +//add getAge>>
                    ", gender=" + getGender() +//add getGender>>
                    ", id=" + id +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }


    }

