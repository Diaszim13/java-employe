

public class empregado {

    private Integer id;
    private String name;
    private Double salary;

    public empregado() {

    }

    public empregado(Integer id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumentaSalario(Double porcentagem) {
        if(porcentagem > 0 ) {
        salary += salary * porcentagem / 100.0;
        }
    }
}
