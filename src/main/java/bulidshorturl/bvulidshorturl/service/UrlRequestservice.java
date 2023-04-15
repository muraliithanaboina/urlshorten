package bulidshorturl.bvulidshorturl.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UrlRequestservice {
   public ResponseEntity<Void> redirect_To_Original_Url( String shortUrl);
}
