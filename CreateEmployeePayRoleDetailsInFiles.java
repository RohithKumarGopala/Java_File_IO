package com.filesIO;

import java.io.*;
public class CreateEmployeePayRoleDetailsInFiles implements Serializable {
    int id;
    String name;
    double salary;
    public CreateEmployeePayRoleDetailsInFiles(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDetailsInFiles{" + "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}
class EmployeeStore{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\gopal\\Rohith.csv");
        CreateEmployeePayRoleDetailsInFiles employeeDetails = new CreateEmployeePayRoleDetailsInFiles(23415,"Rohith",45000);
        System.out.println(employeeDetails);
        ObjectOutputStream ObjStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjStream.writeObject(employeeDetails);
        ObjStream.close();
    }
}

