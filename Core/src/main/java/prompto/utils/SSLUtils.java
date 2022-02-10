package prompto.utils;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.function.Function;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;



public abstract class SSLUtils {
	
	public static <T> T trustingAllCertificates(HttpRequest request, Function<String, T> consumer) throws Exception {
		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, new TrustManager[] { new TrustAllCertificatesManager() }, new java.security.SecureRandom());
		HttpClient client = HttpClient.newBuilder()
				.sslContext(sc)
				.build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		return consumer.apply(response.body());
	}
	
	private static class TrustAllCertificatesManager implements X509TrustManager {
        @Override public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
        @Override public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
        @Override public X509Certificate[] getAcceptedIssuers() { return null; }
    }
}
