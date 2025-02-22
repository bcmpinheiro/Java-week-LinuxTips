public class Profissional {

    //so sao visiveis dentro da classe que estao
    private Double salario;
    private Integer id;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //acessivel por qualquer classe
    public Double salariopublic;
    public Integer idPublic;

    //acessivel pela classe que o declara, suas subclasses em outros pacotes
    //e outras classes do mesmo pacote
    protected Double salarioProtected;
    protected Integer idProtected;

    public String trabalharPublic() {
        return "trabalhando public";
    }

    protected String trabalharProtected() {
        return "trabalhando protected";
    }

    private String trabalharPrivate() {
        return "trabalhando private";
    }


}
