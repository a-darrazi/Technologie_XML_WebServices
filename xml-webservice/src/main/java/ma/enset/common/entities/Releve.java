package ma.enset.common.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.common.config.LocalDateAdapter;

import java.time.LocalDate;

@XmlRootElement(name = "releve")
@XmlAccessorType(XmlAccessType.FIELD)
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Releve {
    @XmlAttribute
    private String rib;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateReleve;
    private double solde;
    private Operations operations;

    @Override
    public String toString() {
        return "Releve{" +
                "rib='" + rib + '\'' +
                ", dateReleve=" + dateReleve +
                ", solde=" + solde +
                '}';
    }
}
