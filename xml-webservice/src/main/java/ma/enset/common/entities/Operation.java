package ma.enset.common.entities;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.common.config.LocalDateAdapter;
import ma.enset.common.enums.OperationType;

import java.time.LocalDate;

@XmlRootElement(name = "operation")
@XmlAccessorType(XmlAccessType.FIELD)
@Data @NoArgsConstructor @AllArgsConstructor
public class Operation {
    @XmlAttribute
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private String description;
    @XmlAttribute
    private OperationType type;


}