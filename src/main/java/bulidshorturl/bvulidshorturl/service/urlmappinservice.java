package bulidshorturl.bvulidshorturl.service;

import bulidshorturl.bvulidshorturl.models.UrlMapping;
import bulidshorturl.bvulidshorturl.models.UrlRequest;
import org.springframework.stereotype.Service;

@Service
public interface urlmappinservice {


      public UrlMapping shortenUrl(UrlRequest urlRequest);
}
