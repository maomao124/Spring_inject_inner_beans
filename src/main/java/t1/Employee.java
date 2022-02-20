package t1;

/**
 * Project name(项目名称)：Spring注入内部Bean
 * Package(包名): t1
 * Class(类名): Employee
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Employee
{
    //员工编号
    private String empNo;
    //员工姓名
    private String empName;
    //部门信息
    private Dept dept;

    public void setEmpNo(String empNo)
    {
        this.empNo = empNo;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("empNo：").append(empNo).append('\n');
        stringbuilder.append("empName：").append(empName).append('\n');
        stringbuilder.append("dept：").append(dept).append('\n');
        return stringbuilder.toString();
    }
}
