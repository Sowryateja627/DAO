//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Dept {
    private int Deptno;
    private String Dname;
    private String loc;

    public Dept() {
    }

    public int getDeptno() {
        return this.Deptno;
    }

    public void setDeptno(int deptno) {
        this.Deptno = deptno;
    }

    public String getDname() {
        return this.Dname;
    }

    public void setDname(String dname) {
        this.Dname = dname;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String toString() {
        return "Dept [ Dept :" + this.Deptno + " Department Name: " + this.Dname + " Department Location: " + this.loc + "]";
    }
}