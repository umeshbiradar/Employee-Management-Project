package com.sj.empmanagmentapplication;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeService {
	

	

	

		HashSet<Employee> empset=new HashSet<Employee>();

		Employee emp1=new Employee(101, "krishna", 24, "Developer", "IT", 25000);
		Employee emp2=new Employee(102, "shiv", 26, "Tester","CO", 57000);
		Employee emp3=new Employee(103, "sekhar", 20, "Tester","Admin", 25000);
		Employee emp4=new Employee(104, "virat", 27, "System Eng","CO",  70000);
		Employee emp5=new Employee(105, "rohit", 26, "Developer","IT",  40000);
		Employee emp6=new Employee(106, "vijay", 30, "Sopport Manager","CO",  35000);
		Employee emp7=new Employee(107, "sanket", 32, "Project Manager","IT",  50000);
		Employee emp8=new Employee(108, "manu", 23, "Developer","CO",  27000);
		Employee emp9=new Employee(109, "tejas", 29, "Tester","Admin",  37000);
		Employee emp10=new Employee(110, "ram", 28, "System Eng","CO",  47000);
		Scanner sc=new Scanner(System.in);
		boolean found=false;
		int id;
		String name;
		int age;
		String department;
		String desiganation;
		double salary;

		public EmployeeService() {

			empset.add(emp1);
			empset.add(emp2);
			empset.add(emp3);
			empset.add(emp4);
			empset.add(emp5);
			empset.add(emp6);
			empset.add(emp7);
			empset.add(emp8);
			empset.add(emp9);
			empset.add(emp10);

		}

		//view all employees
		public void viewAllEmps() {
			for(Employee emp:empset) {
				System.out.println(emp);
			}
		}
		//view emp based on there id
		public void viewEmp(){
			System.out.println("enter the option");
			System.out.println("1.view by id /n 2.view by salary/n 3.desiganation");
			int option=sc.nextInt();
			double salary;
			switch(option) {
			case 1:
System.out.println("Enter id: ");
			id=sc.nextInt();
			for(Employee emp:empset) {
				if(emp.getId()==id) {
					System.out.println(emp);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee with this id is not present");
			}
			break;
			case 2:
			System.out.println("Enter salary: ");
			salary=sc.nextDouble();
			for(Employee emp:empset) {
				if(emp.getSalary()==salary) {
					System.out.println(emp);
					found=true;	
				}
				//break;
			}
			
			if(!found) {
				System.out.println("Employee with this salary is not present");	
			}
			break;
			case 3:
				System.out.println("Enter desiganation: ");
				desiganation=sc.next();
				for(Employee emp:empset) {
					if(emp.getDesiganation().equals(desiganation)) {
						System.out.println(emp);
						found=true;	
					}
					//break;
				}
				
				if(!found) {
					System.out.println("Employee with this desiganation is not present");	
				}
				break;
		}	
		}
		
	
		
			
		
		//update the employee
		public void updateEmployee() {
			System.out.println("Enter id: ");
			id=sc.nextInt();
			boolean found=false;
			for(Employee emp:empset) {
				if(emp.getId()==id) {
					//char ch1=' ';
					//do {
						System.out.println("enter the option");
						System.out.println("1.update name  ");
						System.out.println("2.update age  ");
						System.out.println("3.update desiganation  ");
						System.out.println("4.update department  ");
						System.out.println("5.update salary  ");
						

						int value=sc.nextInt();
						double salary;
						switch(value){
						case 1:
							System.out.println("Enter new name: ");
							name=sc.next();
							emp.setName(name);
							System.out.println("Updated Details of employee are: ");
							System.out.println(emp);
							break;
						case 2:
							System.out.println("Enter new age: ");
							age=sc.nextInt();
							emp.setAge(age);
							System.out.println("Updated Details of employee are: ");
							System.out.println(emp);
							break;
						case 3:
							System.out.println("Enter new desiganation: ");
							desiganation=sc.next();
							emp.setDesiganation(desiganation);
							System.out.println("Updated Details of employee are: ");
							System.out.println(emp);
							break;
						case 4:
							System.out.println("Enter new department: ");
							department=sc.next();
							emp.setDesiganation(department);
							System.out.println("Updated Details of employee are: ");
							System.out.println(emp);
							break;
							
						case 5:
							System.out.println("Enter new salary: ");
							salary=sc.nextDouble();
							emp.setSalary(salary);
							System.out.println("Updated Details of employee are: ");
							System.out.println(emp);
							break;
						}
						
						//System.out.println("do you wish to continue say yes");
						//ch1=sc.next().charAt(0);
						//}while(ch1=='y' || ch1=='Y');

			found=true;
				}
			}
			if(!found) {
				System.out.println("Employee is not present");
				System.out.println("enter correct employee id");
				int id=sc.nextInt();
				
					
				
			}
			else {
				System.out.println("Employee details updated successfully !!");
			}
					}
				

				
				
		
		//delete emp
		public void deleteEmp() {
			System.out.println("Enter id");
			id=sc.nextInt();
			boolean found=false;
			Employee empdelete=null;
			for(Employee emp:empset) {
				if(emp.getId()==id) {
					empdelete=emp;
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee is not present");
			}
			else {
				empset.remove(empdelete);
				System.out.println("Employee deleted successfully!!");
			}
		}
		//add emp
		public void addEmp() {
			System.out.println("Enter id:");
			id=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter Desiganation");
			desiganation=sc.next();
			System.out.println("Enter Department");
			department=sc.next();
			System.out.println("Enter sal");
			salary=sc.nextDouble();

			Employee emp=new Employee(id, name, age, desiganation, department, salary);

			empset.add(emp);
			System.out.println(emp);
			System.out.println("Employee addeed successsfully");

		}

		}


