package bookingservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publicServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Started");
		ServicePublish publisherService = new ServicePublishImpl();
		publicServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stopped");
		publicServiceRegistration.unregister();
	}

}
