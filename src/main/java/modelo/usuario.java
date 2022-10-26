package modelo;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class usuario {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;

    private String name;
    private Integer cpf;
    private Integer telefone1;
    private Integer telefone2;
    private String email;
    private LocalDate dt_Nascimento;

    public usuario(){}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(Integer telefone1) {
        this.telefone1 = telefone1;
    }

    public Integer getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(Integer telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDt_Nascimento() {
        return dt_Nascimento;
    }

    public void setDt_Nascimento(LocalDate dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return Objects.equals(ID, usuario.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "usuario{" +
                ", name='" + name + '\'' +
                ", cpf=" + cpf +
                ", telefone1=" + telefone1 +
                ", telefone2=" + telefone2 +
                ", email='" + email + '\'' +
                ", dt_Nascimento=" + dt_Nascimento +
                '}';
    }
}
