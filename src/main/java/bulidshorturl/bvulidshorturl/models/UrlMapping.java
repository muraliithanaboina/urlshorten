package bulidshorturl.bvulidshorturl.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UrlMapping  {
    @Id
    @GeneratedValue
    private Long ID;
    @Column(unique = true)
    private String originalUrl;
    @NonNull
    private String shortenedUrl;
    private LocalDateTime expirationTime;


}
