public class javaObjToJson {
    public javaObjToJson(String employee, String name, Number eno) {
        this.employee = employee;
        this.name = name;
        this.eno = eno;
    }

    private String employee;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getEno() {
        return eno;
    }

    public void setEno(Number eno) {
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "javaObjToJson{" +
                "employee='" + employee + '\'' +
                ", name='" + name + '\'' +
                ", eno=" + eno +
                '}';
    }

    private String name;
   private Number eno;
}

