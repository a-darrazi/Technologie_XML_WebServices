package ma.enset.common.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.common.config.LocalDateAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlRootElement(name = "operations")
@XmlAccessorType(XmlAccessType.FIELD)
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Operations {
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateDebut;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateFin;
    @XmlElement(name = "operation")
    private List<Operation> operations = new ArrayList<>();

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
