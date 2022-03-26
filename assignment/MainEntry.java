package com.greatlerning.assignment;

public class MainEntry {

	public static void main(String[] args) {

		HrDepartment obj1 = new HrDepartment();
		TechDepartment obj2 = new TechDepartment();
		AdminDepartment obj3 = new AdminDepartment();

		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.getTechStackInformation());
		System.out.println(obj2.isTodayAHoliday());

	}

}
