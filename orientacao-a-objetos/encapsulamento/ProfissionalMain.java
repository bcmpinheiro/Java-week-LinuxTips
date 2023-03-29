public class ProfissionalMain {

    public static void main(String[] args) {

    Profissional profissional = new Profissional();
    profissional.idPublic = 1;
    profissional.trabalharPublic();
    profissional.salarioProtected = 1000.00;
        System.out.println(profissional.salariopublic);

    profissional.setId(1);
    profissional.getId();
    profissional.setSalario(1000.00);
    profissional.getSalario();
    }
}
