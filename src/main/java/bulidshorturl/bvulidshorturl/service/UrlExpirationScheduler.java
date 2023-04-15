//package bulidshorturl.bvulidshorturl.service;
//import bulidshorturl.bvulidshorturl.dao.UrlMappindao;
//import bulidshorturl.bvulidshorturl.models.UrlMapping;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Timer;
//import java.util.TimerTask;
//@Component
//    public class UrlExpirationScheduler {
//
//        private Timer timer;
//
//        public UrlExpirationScheduler() {
//            timer = new Timer();
//            timer.schedule(new ExpirationTask(), 0, 60 * 1000); // Run every minute
//        }
//
//        class ExpirationTask extends TimerTask {
//            @Autowired
//            private UrlMappindao urlMappindao;
//            public void run() {
//                Date now = new Date();
//                long expirationTimeMillis = now.getTime() - (5 * 60 * 1000); // 5 minutes ago
//                Date expirationTime = new Date(expirationTimeMillis);
//
//                // Query the database for expired URLs
//                List<UrlMapping> expiredUrls = urlMappindao.findByCreationTimeBefore(expirationTime);
//
//                // Remove the expired URLs from the database
//                if(!expiredUrls.isEmpty()) {
//                    for (UrlMapping urlMapping : expiredUrls) {
//
//                        urlMappindao.delete(urlMapping);
//                    }
//                }
//            }
//        }
//    }
//
//
