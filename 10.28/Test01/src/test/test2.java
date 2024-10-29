package test;

import dao.EmpDao;
import entity.Emp;

import java.text.*;

public class test2 {
    public static void main(String[] args) throws ParseException {
        EmpDao dao = new EmpDao();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Emp emp = new Emp();
        emp.ename = "王五";
        emp.eid = "e007";
        emp.sex = "女";
        emp.salary = 5000;
        emp.hiredate = sdf.parse("2023-8-8");
        dao.addEmp(emp);
    }

}
