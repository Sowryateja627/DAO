
public class Dependents {
    private int dno;
    private String dname;
    private String dfirst;
    private Emp emp;

    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public String getDfirst() {
        return dfirst;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDfirst(String dfirst) {
        this.dfirst = dfirst;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dependent Number: ").append(dno)
                .append(", Name: ").append(dname)
                .append(", First Name: ").append(dfirst);
        if (emp != null) {
            sb.append(", Employee: ").append(emp.getEname()); // Assuming emp has a getEname() method
        } else {
            sb.append(", No associated employee");
        }
        return sb.toString();
    }
}