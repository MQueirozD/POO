
package exemploheranca;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String email;
    private String celular;
  
    public String imprimir(){
        return "Email: " + email + "\nCelular: " + celular;
    }

  
    
    

}
