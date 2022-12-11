package devinhouse.semana8.exercicios.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaModel {
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }
}
