package ru.mikhail.katya.lab1.pojo;

import jdk.jfr.ContentType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@EqualsAndHashCode(callSuper = false)
@Data
@ToString(callSuper = true)
public class Pdf extends Document {

//    public Pdf(String name, String content) {
//        super(name, content);
//    }
    public Pdf(){ super("pdf-name", "pdf-content"); }
}
