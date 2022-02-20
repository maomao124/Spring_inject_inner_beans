package t1;

/**
 * Project name(项目名称)：Spring注入内部Bean
 * Package(包名): t1
 * Class(类名): Dept
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Dept
{
    //部门编号
    private String deptNo;
    //部门名称
    private String deptName;

    public void setDeptNo(String deptNo)
    {
        this.deptNo = deptNo;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("deptNo：").append(deptNo).append('\n');
        stringbuilder.append("deptName：").append(deptName).append('\n');
        return stringbuilder.toString();
    }
}
