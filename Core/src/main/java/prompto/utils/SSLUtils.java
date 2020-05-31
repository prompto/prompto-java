package prompto.utils;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;



public abstract class SSLUtils {
	
	@FunctionalInterface
	public interface ResultSupplier<T> {
		T apply(HttpsURLConnection cnx) throws IOException;
	}
	
	public static <T> T trustingAllCertificates(URL url, ResultSupplier<T> supplier) throws Exception {
		HttpsURLConnection cnx = (HttpsURLConnection) url.openConnection();
		try {
			trustAllCertificates(cnx);
			cnx.setHostnameVerifier(new HostnameVerifier() { @Override public boolean verify(String hostName, SSLSession session) { return true; } });
			return supplier.apply(cnx);
		} finally {
			cnx.disconnect();
		}
	}
	
	public static void trustAllCertificates(HttpsURLConnection cnx) throws GeneralSecurityException {
		// Install the all-trusting trust manager
		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, new TrustManager[] { new TrustAllCertificatesManager() }, new java.security.SecureRandom());
		cnx.setSSLSocketFactory(sc.getSocketFactory());	
		cnx.setHostnameVerifier(new HostnameVerifier() { @Override public boolean verify(String hostName, SSLSession session) { return true; } });
	}


	private static class TrustAllCertificatesManager implements X509TrustManager {
        @Override public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
        @Override public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
        @Override public X509Certificate[] getAcceptedIssuers() { return null; }
    }
}
