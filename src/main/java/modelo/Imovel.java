package modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String tipo_Imovel;
    private String endereco;
    private Double valor_Aluguel_Sugerido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_Imovel() {
        return tipo_Imovel;
    }

    public void setTipo_Imovel(String tipo_Imovel) {
        this.tipo_Imovel = tipo_Imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValor_Aluguel_Sugerido() {
        return valor_Aluguel_Sugerido;
    }

    public void setValor_Aluguel_Sugerido(Double valor_Aluguel_Sugerido) {
        this.valor_Aluguel_Sugerido = valor_Aluguel_Sugerido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Objects.equals(id, imovel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "imovel{" +
                "tipo_Imovel='" + tipo_Imovel + '\'' +
                ", endereco='" + endereco + '\'' +
                ", valor_Aluguel_Sugerido=" + valor_Aluguel_Sugerido +
                '}';
    }
}
