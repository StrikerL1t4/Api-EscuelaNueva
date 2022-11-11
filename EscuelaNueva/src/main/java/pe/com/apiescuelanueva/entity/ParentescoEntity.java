package pe.com.apiescuelanueva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data
//----------------------
@Entity(name="ParentescoEntity")
@Table(name="parentesco")
public class ParentescoEntity {
    //atributos
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="despar")
    private String descipcion;
    @Column(name="estpar")
    private boolean estado;
    
   
    
}
